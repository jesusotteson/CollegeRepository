//JAVASCRIPT STUFF
var userGuess;
var secretNumber;
function resetGame()
{
	document.getElementById("user-guess").value = "";
	document.getElementById("user-guess").select();
	document.getElementById("display-message").innerText = "Let's feed the Ducks! How many ducks do you want to feed?";
	document.getElementById("display-image").innerHTML= '<img src="img/start-duck.jpg">';
	secretNumber = Math.ceil(Math.random()*99);
	console.log(secretNumber);
}
function playGame()
{
	userGuess = document.getElementById("user-guess").value;
	if (userGuess == secretNumber) changeDisplay("win");
	else if (userGuess > secretNumber) changeDisplay("high");
	else if (userGuess < secretNumber) changeDisplay("low");
	else changeDisplay("error");

	document.getElementById("user-guess").select();
}
function changeDisplay(winCode)
{
	switch(winCode)
	{
		case "win":
		document.getElementById("display-message").innerText = "Yay! You fed the Ducks!";
		document.getElementById("display-image").innerHTML= '<img src="img/you-fed-the-ducks.jpg">';
		break;

		case "high":
		document.getElementById("display-message").innerText = "You over fed the Ducks!";
		document.getElementById("display-image").innerHTML= '<img src="img/fat-duck.jpg">';
		break;

		case "low":
		document.getElementById("display-message").innerText = "You didn't feed enough Ducks...";
		document.getElementById("display-image").innerHTML= '<img src="img/no-ducks.jpg">';
		break;

		case "error":

		default:
		document.getElementById("display-message").innerText = "You have angered the Ducks...";
		document.getElementById("display-image").innerHTML= '<img src="img/too-many-ducks.jpg">';
		break;
	}
}
