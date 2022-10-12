/* 문제
 자바스크립트 작업
 1. 버튼 이벤트 생성, 함수 input
 2. input함수에서 value가밧 가져오고 출려
 3. getYear함수(태어난년도 구하기)
 4. getmonth함수(태어난 월 구하기)
 5. getAge함수( 나이 구하기)
 */
// 내가 푼것
// window.onload = function(){
//     var bt = document.getElementsByTagName('button')[0];
//     bt.addEventListener("click",input);
// }
// function input(){
// var value = document.getElementById('input').value;
// var num = new Array();
// for(var i = 0; i<3; i++){
//     num[i] = value.split(".");
// }
// var year = num[0];
// getYear(year);

// var month = num[1];
// getMonth(month)

// var age = num[0];
// getAge(age)
// }

// function getYear(year){
// var year = document.getElementById("year");
// var result = year + "년도";
// year.innerHTML = result;
// }
// function getMonth(month){
//     var month = document.getElementById("month");
//     var result = month + "월";
//     month.innerHTML = result;
// }
// function getAge(age){
//     var age = document.getElementById("age");
//     var result = 2022 - parseInt(age) +"세"
//     age.innerHTML = result;
// }
//
//정답
window.onload = function(){
    document.getElementById("bt").addEventListener("click",input);
}
function input(){
    var birth = document.getElementById("input").value;
    var birth_year = getYear(birth);
    var birth_month = getMonth(birth);
    var birth_age = getAge(birth);

    var info = document.getElementsByClassName("info");
    info[0].innerHTML=birth_year;
    info[1].innerHTML=birth_month;
    info[2].innerHTML=birth_age;

}

function getYear(birth){
    year = birth.split(".")[0];
    return year;
}

function getMonth(birth){
    month = birth.split(".")[1];
    return month;
}

function getAge(birth){
    year = birth.split(".")[0];
    age = 2022-parseInt(year)+1;
    return age;
}