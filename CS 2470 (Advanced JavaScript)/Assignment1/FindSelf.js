function myFunction(arr){
  var things = "<section><header>Complex Self</header><ul>";
  var i = 0;
  var len = arr.length;
  while (i < len) {
      things += '<li><ul><li><b>' + arr[i].Age + '</b></li><li>' +
        arr[i].Name + '</li>';
    if (arr[i].Married == true) {
      things += '<li> Years Married: ' + arr[i].Years + '</li>';
      }
    if (arr[i].Classes instanceof Array) {
      things += '<li>Classes: <ul>';
      var awardcount = arr[i].Classes.length;
      var k = 0;
      while (k < awardcount) {
        things += '<li>' + arr[i].Classes[k] + '</li>';
        k++
        }
      things += '</ul></ul></li>';
      }
    if (arr[i].Married == true) {
      things += '<li> Hobbies: ' + arr[i].Hobbies + '</li>';
      }
    else {
      things += '</ul></li>';
    }
    i++;

    }
  things += '</ul></section>';
  document.getElementById("main").innerHTML = things;
}
