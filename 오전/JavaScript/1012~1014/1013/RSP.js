// 유저입력함수
function user(){
var userV = document.getElementById("user").value;
if(userV>3||userV<1) {
    alert("숫자를 잘못 입력 하셨습니다! 가위 = 1, 바위 = 2, 보 = 3 ");
return;}
random(userV);
}

// 랜덤값 구하는 함수
function random(userV){
var com = Math.floor(Math.random()*3)+1;
var userV = userV;
console.log(userV);
result(userV,com);
}

// 승패 구하는 함수 가위1바위2보3
function result(user,com){
var out1 ="";
    if((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2)) out1 = "유저승리"; 
    else if(user==com) out1= "비겼습니다.";
    else out1 = "컴퓨터 승리";
    out(out1);
}
// 결과 출력함수
function out(out1){
var result = document.getElementById("result");
result.innerHTML=out1;
}

// //정답
// user();
// function user(){
//     var u = parseInt(prompt("가위 = 1, 바위 = 2, 보 = 3"));
//     var c= com();
//     result(u,c);
// }
// function com(){
//     var c= Math.floor(Math.random()*3)+1;
//     return c;
// }
// function result(u,c){
//     if(u==c)alert("비김");
//     else if((user==1&&com==3)||(user==2&&com==1)||(user==3&&com==2))alert("유저승리");
//     else alert("컴퓨터 승리");
// }