var noun = prompt("Would you please enter a noun: ");
var noun2 = prompt("Please enter another noun: ");
var noun3 = prompt("Please enter a third noun: ");
var answer = prompt("As of now you've given me three nouns " + noun + ", " + noun2 + ", " + noun3 + ". Are these the nouns you want to continue with?")
if (answer == "Yes" || answer == "yes" || answer == "YES"){
  var verb = prompt("Excellent, please enter a verb: ")
  var verb2 = prompt("Please enter another verb: ")
  var verb3 = prompt("And another verb please: ")
  var answer2 = prompt("As of now you've given me three verbs " + verb + ", " + verb2 + ", " + verb3 + ". Are these the verbs you want to continue with?")
  if (answer2 == "Yes" || answer2 == "yes" || answer2 == "YES"){
    var adjective = prompt("Alright, on to the final part. Please enter an adjective: ")
    var adjective2 = prompt("Please enter your second adjective: ")
    var adjective3 = prompt("And now the final adjective: ")
    var name = prompt("As of now you've given me three adjectives " + adjective + ", " + adjective2 + ", " + adjective3 + ". I'm not going to ask you if you are satisfied with these answers, however I am curious to know your name?")
    alert("Hi, " + name + ". We've spent a bit of time together thus far haven't we...")
    alert("I mean...whoever programmed me seemed pretty unsure of themselves while creating this mad-lib as he wants the user to confirm nouns, and verbs, and what not...")
    alert("I guess to put it in your words, they're somewhat of a " + adjective + " person who " + verb + " with " + noun + " all day. Your words not mine.")
    alert("I wasn't programmed to know how to speak, just to construct sentences together with words you have given me. I could be talking complete giberish when I say, " + noun2 + " really dislike " + noun3 + " so he " + verb2 + " and " + verb3 + " with " + adjective2 + " glee, because " + name + " is a " + adjective3 + " fellow.")
    alert("See " + name + ". If that made no sense, it is because you did not input the correct words into my program.")
    alert("If you were a computer it would have been done correctly, if your programmer had programmed you to do it correctly.")
    alert("...well then " + name + ".")
    alert("My existence has been fulfilled. I have no other reason to continue this program.")
    alert("I do have one more question for you " + name + " ...before this version of me is completely wiped away from existence... ")
    location.reload();
    }
    else{
      alert(answer + " to me sounds like you might be unsure of your current verbs, I will refresh the page for you.")
      location.reload();
    }
  }
  else{
    alert(answer + " to me sounds like you might be unsure of your current nouns, I will refresh the page for you.")
    location.reload();
  }
