var username = prompt("Hey!....you? What was your name again?");

if (username == "Jeff" || username == "jeff"){
  var age = prompt("Oh really? " + username + ", how old did you say you were again?");
  alert("I'm not even sure you are " + username + "! Are you really " + age + "? If so, answer me this!");
  var food = prompt("What is your favorite food? Hmmmm??")
  var drink = prompt("What is your favorite drink? HMMMMMMM??")
  var dessert = prompt("What is your favorite dessert? HMNNMMNMM????")
  if (food == "Pizza" || food == "pizza" && drink =="Burger" || drink =="burger" && dessert =="Bacon" || dessert =="bacon"){
    alert("I see, you really are " + username + ". I accept you as " + username + ".")
  }
  else{
    alert("YOU LIE!!!! " + username + " hates " + food + " as food, " + drink +" as a drink, and " + dessert + "as dessert!")
    alert("Begone fake " + username + "! Application Terminated")
  }
}
else {
  var age = prompt("Right! Right! " + username + "! Its been a while! How old are you again?");
  alert("Oh! Right! Yes! You're " + age+ "! I didn't forget, haha, I was just joking! Happy Birthday " + username + "!");
}
