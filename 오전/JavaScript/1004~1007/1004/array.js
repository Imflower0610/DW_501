//array.js

//window.onload : html문서의 모든 내용이 브라우저에 표시된 이후에 동작
//window객체 : 브라우저를 싱행시키기 위한 프로그램 틀
//window에만 onload있는거 아님, 모든 객체(html태그포함)ㅇ에 존재
//load => 불러오기 즉 onload는 불러오는 작업이 끝났을 때 동작
/*
var item_list = ["핸드폰거치대", "급속충전기", "C타입케이블", "강화유리", "스마트폰 링", "스마트폰 커버"];
window.onload = function () {
    var li = document.getElementsByClassName("item");
    //var li = document.querySelectorAll(".item");

    //for(var i=0; i<li.length; i++)
    for (var i in li) { // for ( in) : 배열구조에서 사용
        li[i].innerHTML = item_list[i];
    }
}
*/

var item = new Array();
function enroll() {
    var name = document.getElementById("item_name");
    // var name = document.quertSelector("#item_name")

    var prop = name.value;
    item.push(prop);
    var ul = document.querySelector("#item_list");
   
        var li = document.createElement('li');// li 태그 생성
        li.innerHTML = item[item.length-1];// li 태그 안에 제품명 삽입
        var bt = document.createElement('button'); //button 태그 생성
        bt.setAttribute('class','del_bt'); // 클래스명 부여 
        bt.setAttribute('onclick','del(this)'); // onclick이벤트 생성
        bt.innerHTML = '삭제';
        li.appendChild(bt);
        ul.appendChild(li)//ul 태그 자식으로 li추가    
}

function del(obj){
    var parent_li = obj.parentNode;
    var parent_ul = parent_li.parentNode;
    parent_ul.removeChild(parent_li);
}


/* tree구조
body ┐ 
     ├ div    ┬ input
     │        └ button
     └ button  ... 

- 트리구조에서는 태그를 node라고 부름

    새 태그(엘리먼트, 요소, 객체)를 생성하는 방법 : createElement() 함수
    태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법 : innerHTML
    태그(엘리먼트) 내부에 새로운 내용을 추가하는 방법 : appendChild
    태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendChild(textnode)
    #a div
*/

/*

document.createElement :  새 태그 생성
예시) document.createElement('div'); div 생성

appendChild : 자식 태그로 추가
예시) p = document.createElement("p");
body.appendChild(p); : body에 p태그 추가

setAttribute : 태그에 새속성 추가
예시) p.setAttribute('id','ppp'); 해당 태그에 id=ppp삽입

removeChild : 자식 태그 삭제
예시) body.removeChild(p); : body 태그에서 해당 태그 삭제

*/
