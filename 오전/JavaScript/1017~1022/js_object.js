
var cnt = 1;

function send(){
var row = document.getElementById("row").value;
var col = document.getElementById("col").value;
var width = document.getElementById("width").value;
var height = document.getElementById("height").value;

    document.write('<table border="1">');
    for (let i = 0; i < row; i++) {
      document.write('<tr width =' + width + '" height ="'+ height+'px">');
      for (let j = 0; j < col; j++)  {
        document.write('<td>');
            document.write('세팅'+cnt);
        document.write('</td>');
      }
      document.write('</tr>')
    }
    document.write('</table>');
    
    var bt = document.createElement('button');
    var contents = document.createTextNode("세팅"+cnt);
    bt.appendChild(contents);
    document.body.insertBefore('bt');
    add();
}

function add(){
    var contents = document.createTextNode("세팅"+cnt);
    var div = document.createElement('div');
    div.appendChild(contents);
    document.body.appendChild(set);
    
    var currentDiv = document.getElementById("div1");
    document.body.insertBefore(newDiv, currentDiv);
}
