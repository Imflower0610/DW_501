//func.js

/*
html 작업
1. input 2개 생성 - 너비 150, 높이 35, 둥근 모서리
2. 버튼 1개 생성 -> text 입력, 너비 80, 높이 35
    검정바탕 흰색글씨, 글씨크기 15px
3. div 생성-> id : output, 너부 300, 화면가운데 표시

자바스크립트 작업
1. 입력 버튼 클릭시 동작함수 생성 - 함수명 input
2. input함수 -> 두 input value값 가져오기
3. list_push 함수 -> 두개 value값 input함수로부터 받아서 배열 list에 저장
4. output_list함수 -> 배열 list의 값 div#output에 출력
    이름출력영역 너비 150 높이30
*/

// 내가 푼것
window.onload = function(){
var bt = document.getElementsByTagName('button')[0];
bt.addEventListener("click", input);
}

function input(){
var input = document.getElementsByTagName('input');
list_push(input[0].value, input[1].value);
input[0].value=""; 
input[1].value="";
}

var list = new Array();
function list_push(name, job) {
    var out = "<span>" + name + " </span><span>"+job+"</span><br>";    
    list.push(out);
    output_list();
}

function output_list() {
var output= document.getElementById("output");
var result = "";
for(var i in list){
    result += list[i]
}
output.innerHTML = result;
}


// 쌤이 푼것
// window.onload = function(){
//  document.getElementById("bt").addEventListener("click", input);
// }

// function input(){
//     var name = document.getElementById("name");
//     var job = document.getElementById("job");
//     //input 엘리먼트 객체로 가져오기
//     list_push(name.value, job.value);
//     //input calue 갑 list_push에 넘기기
//     name.value =""; // name input 초기화
//     job.value =""; // job input 초기화
//     name.focus(); // name input에 커서 이동
// }

// var list = new Array();
// function list_push(name,job){
//     var out = "<span>" + name + " </span><span>"+job+"</span>";    
//     list.push(out);
//     // list.push([name, job]);
//     // list.push({n:name, j:job});
//     output_list();
// }

// function output_list(){
//     var div = document.getElementById("output");
//     var out = ""; 
//     for(var i in list){
//         out += list[i]
//     }
//     div.innerHTML = out;
// }

