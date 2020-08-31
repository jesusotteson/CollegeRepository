
function myFunction(arr){
  var things = "<section><header>List of Cool Books</header><ul>";
  var i = 0;
  var len = arr.length;
  while (i < len) {
      things += '<li><ul><li><b>' + arr[i].Title + '</b></li><li>' +
        arr[i].Author + '</li>';
    if (arr[i].Forsale == true) {
      things += '<li> Price: ' + arr[i].Price + '</li>';
      }
    if (arr[i].Awards instanceof Array) {
      things += '<li>Awards: <ul>';
      var awardcount = arr[i].Awards.length;
      var k = 0;
      while (k < awardcount) {
        things += '<li>' + arr[i].Awards[k] + '</li>';
        k++
        }
      things += '</ul></ul></li>';
      }
    else {
      things += '</ul></li>';
    }
    i++;

    }
  things += '</ul></section>';
  document.getElementById("main").innerHTML = things;
}
