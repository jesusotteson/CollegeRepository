//JAVASCRIPT STUFF
var userInput = prompt("Enter a number:");
var rand;
var lotto = [];
var output = "";

for (i = 0; i < userInput; i++)
{
	rand = Math.ceil(Math.random() * 99);
	lotto[i] = rand;
}

for (i = 0; i < lotto.length; i++)
{
	if (i==0) 	output = output + lotto[i];
	else output = output + "-" + lotto[i];
}
document.write(output);
