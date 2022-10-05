

window.onload = function(){
    var add = document.querySelector("#add");
    add.addEventListener("click", tag_add) 
    // add.addEventListener("click", function(){this. }) 
    // 직접 함수 적거나, 함수 이름 적고 따로 만들거나 방법은 두가지
};

var add_check = false;

function tag_add(){
    if(add_check){
        return;
    }
    add_check = true;
    var Pdiv = document.querySelector('#score_wrap');
    var div = document.createElement("div");


    var ipt = document.createElement("input");
    ipt.setAttribute("type", "text"); // ipt에 type=text 넣어줌
    ipt.setAttribute("id", "name");
    ipt.setAttribute("placeholder", "이름");
    div.appendChild(ipt);

    var course = [
    ["국어", "kor"], 
    ["수학", "mat"],
    ["영어", "eng"]];

    for (let i = 0; i < 3; i++){
        ipt = document.createElement("input");
        ipt.setAttribute("type", "number"); // ipt에 type=text 넣어줌
        ipt.setAttribute("id", course[i][1]);
        ipt.setAttribute("placeholder", course[i][0]);
        div.appendChild(ipt);
    }
    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    var text = document.createTextNode('등록');
    bt.appendChild(text);

    div.appendChild(bt);
    //input 태그들을 새 div에 넣고 score_wrap에 추가하기

    Pdiv.appendChild(div);// score_wrap div 추가
}
// window.onload = function() : 윈도우 창이 열려져 있을 때 기능 작동
// addEventListener : 태그에 이벤트 설정하는 함수
// addEventListener("이벤트", "이벤트발생시 동작함수", 리턴값(리턴값은 생략 가능))
// setAttribute()는 태그 안에 넣을 수 있던 것만 가능!

function enroll(){
 add_check = false;
 var name = document.querySelector("#name").value;
 var kor = document.querySelector("#kor").value;
 var mat = document.querySelector("#mat").value;
 var eng = document.querySelector("#eng").value;

 var Pdiv = document.querySelector("#score_wrap");

 //score_wrap div에 추가하는 작업
 var div = document.createElement("div");
 div.setAttribute('class','score');

 var data = [name, kor, mat, eng];
 for (let i in data){//input태그에 입력된 값을 h3태그에 삽입
    let h = document.createElement('h3');
    let text = document.createTextNode(data[i]);
    h.appendChild(text);
    div.appendChild(h);
 }

var input = Pdiv.lastChild;
Pdiv.removeChild(input);//input 태그 삭제

Pdiv.appendChild(div);// input 태그값 div에 삽입

}
