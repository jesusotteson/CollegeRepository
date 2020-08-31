//JAVASCRIPT STUFF

var markers = ['<img src="img/Jeff.png">','<img src="img/Cat.png">'];
var players = [];
var points = [0,0];
var whoseTurn = 0;

var winValues = [7,56,73,84,146,273,292,448];
var gameOver = false;

players[0] = prompt("Enter Player 1");
players[1] = prompt("Enter Player 2");

function reset()
{
  var gameOver = false;
  var points = [0,0];
  var whoseTurn = 0;
  drawBoard();
}

function drawBoard()
{
  var display = "";
  var binaryCount = 1;
  for (var i = 1; i <= 3; i++)
  {
    display += '<div id="row-'+i+'">';
    for (var j =0; j <3; j ++)
    {
      display += '<div onclick="playGame(this,'+binaryCount+');"></div>';
      binaryCount *= 2;
    }
    display += '</div>';
  }
  display += '<button class="btn" onclick="reset();">Play Again?</button>';
  document.getElementById('game-board').innerHTML = display;
}

function gameMessage(text)
{
  document.getElementById("game-message").innerText = text;
}

function playGame(clickedDiv, divValue)
{
  if (!gameOver)
  {
    clickedDiv.innerHTML = markers[whoseTurn];
    points[whoseTurn] += divValue;
    clickedDiv.attributes["0"].nodeValue = "";
    if (isWin())
    {
      gameMessage (players[whoseTurn] + " Wins!");
      gameOver = true;
    }
    else if (gameOver)
    {
      gameMessage ("IT'S A TIE!!!");
      gameOver = true;
    }
    else
    {
      if (whoseTurn == 0) whoseTurn = 1; else whoseTurn = 0;
      gameMessage (players[whoseTurn] + "'s Turn");
    }
  }
}

function isWin()
{
  for (i = 0; i < winValues.length; i++)
  {
    if((points[whoseTurn] & winValues[i]) == winValues[i])
  {
    gameOver = true;
    return true;
  }
}

if ((points[0] + points[1]) == 511)
  {
    gameOver = true;
  }
  return false;
}
