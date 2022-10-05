window.onload = function(){
    var Pdiv = document.querySelector("#input_wrap");
    var input = document.createElement("input");
    
    var city = document.createTextNode('도시');
    Pdiv.appendChild(city);
    input = document.createElement("input");
    input.setAttribute("type","text");
    input.setAttribute("id","city");
    Pdiv.appendChild(input);

    var num = document.createTextNode('확진자수');
    Pdiv.appendChild(num);
    input = document.createElement("input");
    input.setAttribute("type","number");
    input.setAttribute("id","num");
    Pdiv.appendChild(input);

    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    var text = document.createTextNode('추가+');
    bt.appendChild(text);
    Pdiv.appendChild(bt);
   
};
var num = 1;
function enroll(){
    var city = document.querySelector('#city').value;
    var cnt = document.querySelector('#num').value;
    var div = document.createElement('div');
    var h = document.createElement('h3');
    h.appendChild(document.createTextNode(num++));
    div.appendChild(h);
    h = document.createElement('h3');
    h.appendChild(document.createTextNode(city));
    div.appendChild(h);
    h = document.createElement('h3');
    h.appendChild(document.createTextNode(cnt + '명'));
    div.appendChild(h);

    var parent = document.querySelector('#result');
    parent.prepend(div);
   




}