//JAVASCRIPT STUFF
function toggleText()
{
  if (document.getElementById("toggle-text").innerText == "Grow Text"){
  document.getElementById("div.p").className = "";
  document.getElementById("toggle-text").innerText = "Shrink Text";
  }else{
  document.getElementById("div.p").className = "small";
  document.getElementById("toggle-text").innerText = "Grow Text";
  }
}
function swapImage()
{
  if(document.getElementById("band-image").attributes.src.nodeValue == "img/europe2.jpg")
  {
  document.getElementById("band-image").src="img/europe1.jpg";
  document.getElementById("button-name").innerText = "Old Europe";
  }else{
  document.getElementById("band-image").src="img/europe2.jpg";
  document.getElementById("button-name").innerText = "Young Europe";
  }
}

function toggleMembers()
{
	if (document.getElementById("band-members").className == "show")
	{
		document.getElementById("band-members").className = "";
		document.getElementById("toggle-band").innerText = "Show Members";
	}
	else
	{
		document.getElementById("band-members").className = "show";
		document.getElementById("toggle-band").innerText = "Hide Members";
	}
}
