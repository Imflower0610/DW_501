
// 객체 : 사물, 사람, 동물 등 대표성을 지닌 독립적인 존재
/*
    모든 객체는 자신만의 속성(특징)을 가지며, 자신만의 행동을 갖는다.
        -   객체는 자신만의 속성을 가진다. -> 변수
        -   객체는 자신만의 행동을 갖는다. -> 함수

    객체정의 : 추상화시켜 놓은 것
    추상화의 기본 : 속성과 행동을 나열하고 구성한다.
    멤버변수 : 객체의 속성을 구성
    멤버함수 : 객체의 속성을 기반으로 행동을 구현해놓은 코드
    
    객체생성 : new 연산자를 통해서 생성
    생성된 객체는 변수에 저장하여 사용하는데 이때 변수를 참조변수라고 한다.
    참조변수는 ram의 주소를 저장하는 변수이다.
*/
var obj = new Object();// 변수에 생성된 객체를 담는다.

/*  도형 객체
    도형.모양 = 사각형
    도형.위치 x축 = 120;
    도형.위치 y축 = 50;
    도형.그리기(함수)
    도형.지우기(함수)

    도형.모양 = 삼각형
    도형.위치 x축 = 200;
    도형.위치 y축 = 120;
    도형.그리기
    도형.지우기
    *'.'을 써야 그 속성으로 들어감

    객체의 멤버로 접근하기 위한 연산자(.) - access 연산자 접근연산자
    접근연산자는 +, -, ++, &&, || 등 보다 우선순위가 높음
    도형.위치x축 + 10; <- 접근연산자 순위 약 4위 (대입연산자, 중간연산자, 논리연산자보다도 우선순위가 높음)
        * 우선순위 : 1순위 (), 2순위[], 3순위 ->
        * 자바, c언어에서도 같은 순위(c언어에는 객체라는 개념은 없지만)
*/

/* 객체 생성방법
    1. 객체 리터럴 방식 : 변수처럼 생성하는 방식
*/
var shape = {
    모양: "사각형",
    x축: 120,
    y축: 23,
    draw: function () {
        return "x축 : " + this.x축 + "y축 : " + this.y축 + "위치에 " + this.모양 + "그리기";
    }
};
//객체 내부에서 함수 생성시, 변수(key)의 사용은 'this'로 접근한다.
//객체의 값 출력 -> "객체.key"를 사용
document.write("모양" + shape.모양);
document.write(shape.draw());
// 예)
//  학생 객체 생성(학년, 반, 번호, 이름)
var name = "김철수"
var student = {
    학년: 1,
    반: 3,
    번호: 2022010327,
    이름: name // 중앙선 표시된 것은 권장하지 않는 방식이라는 의미
};
document.write("<br>" + student.이름);

/* 객체생성방법
    2. 생성자 방식 -> new연산자로 생성하는 방식
        * 생성자방식 1) Object객체로 생성
        * 생성자방식 2) 함수를 통한 생성
*/
        // 1) Object객체로 생성
            var music = new Object();
            music.title = "Santa Tell Me"; // key와 value를 설정하는 방법은 여러가지다.
            music['가수'] = "Ariana Grande";
            music.link = '<iframe width="640" height="360" src="https://www.youtube.com/embed/nlR0MkrRklg" title="Ariana Grande - Santa Tell Me (Official Video)" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>';
            
            document.write("<a href = 'javascript : open();'>" + music['title'] + " " + music.가수 + "</a>");//접근연산자에서도 마찬가지로 표현방식 여러가지
           
            function open(link) {
            document.getElementById("play").innerHTML = music.link;
            }
        // 2) 함수를 통한 생성
           /*
            var 제목 = '안녕';
            var 가수 = '폴킴';
            music.title = 제목;
            music.가수 = 가수;
            document.write(music['title']+""+ music.가수);
           */

            function movie(제목, 감독, 년도, 장르){ // value로 들어올 매개변수 만들어야 함
                this.영화제목 = 제목; // key를 만들 때는 앞에 this를 붙여서 key를 만들어야 한다.
                this.감독 = 감독;
                this.개봉년도 = 년도;
                this.장르=장르;
                this.view = function(){
                    return this.영화제목 + " " + this.감독;
                };
            }
            movie.prototype.view = function(){
                return this.영화제목 + "" + this.감독;
            }

            var m1 = new movie('한산', '김**', 2022, '쩐의 전쟁');
            document.write(m1.영화제목);
            var m2 = new movie('공조2','이석훈',2022,'액션');
            document.write(m2.view());
