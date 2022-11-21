package house;

public class main_house {

	public static void main(String[] args) {
		// 클래스의 객체(인스턴스) 생성 방법
		// 클래스명 참조변수명 = new 클래스명(); -> 클래스명()은 클래스생성자메서드 호출이다
		
		// 다형성 - 다양한 여러가지 형태 성질을 가지는 것
		// 자바 다형성 - 하나의 클래스로 여러 클래스를 표현할 수 있는 방식
		
		
		tv[] t = new tv[] {
				new tv("삼성", 1230000,65), new tv("LG", 1505000,65),
				new tv("삼성", 890000,55), new tv("LG", 2240000,75),
				new tv("삼성", 730000,50)
				};
		
		aircon[] air = new aircon[] {
				new aircon("휘센",1230000,17),new aircon("캐리어",1619800,25),
				new aircon("휘센",1587110,30),new aircon("위니아",189000,17),
				new aircon("비스포크",1878590,19)
		};
		
		t[0].buy();
		
		air[1].buy();
		
		tv t1 = new tv();
		t1.brand="";
		t1.price=11;
		t1.inch=20;
		
		house_item t2 = new tv();
		t2.brand="";
		t2.price=22;
//		t2.inch=20;-> 자식은 부모가 가진거 사용 가능하지만 부모는 자식이 가진거 사용불가
		
		tv t3 =(tv)t2;
		t3.inch=20;
		
		//tv t4 = new house item;
		
	// 클래스 구별하는 연산자
	/*	if(t3 instanceof aircon) {
			System.out.println("에어컨 객체이다.");
		}*/
		if(t3 instanceof tv) {
			System.out.println("tv 객체이다.");
		}
		
		int a = (int)3.14;
		float f = 3.14f;
		
		
/*
  		tv t = new tv("삼성", 1230000);
 
		tv t2 = new tv("LG",985000);
		
		aircon air1 = new aircon("휘센",940000);
		aircon air2 = new aircon("위니아",560000);

		computer com1 = new computer("정수pc", 780000);
		
		System.out.println(t.toString());
		
*/
		
/*
  		tv t = new tv();	
		aircon air = new aircon();
		air.brand = "휘센";
		air.price = 1200000;
		System.out.println(air.brand);
		System.out.println(t.onoff);
		
		t.power();
		t.power();
		air.power();
 */		
		
		
	}
}

/* 클래스 관계 - 상속, 포함
 	
* 자바의 상속 : 자바의 상속이란 기존 클래스를 재사용하여 새로운 클래스를 작성하는 것 	
	상속 - 부모자식 관계
		부모클래스	 - 자식1 클래스
 				 - 자식2 클래스
 				 - 자식3 클래스

	예)
 		<div> -> width:300px;
 			<div> -> font-size : 15px;
 				<img>
 				<input>
 				</div>
 		</div>
 	
 	* 상속관계는 왜 사용하는가?
	- 관리를 좀 더 용이하게 하기 위해서
	- 재활용성(기존 클래스의 재사용)
	- 코드의 중복성제거
	- 프로그램 생산성과 유지보수 용이

 	* 상속관계의 다형성	
 	다형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미한다. 
 	키보드의 키를 사용하는 방법은 '누른다'이다. 
 	하지만 똑같이 키를 누르더라도 ESC는 취소를 ENTER는 실행의 목적을 가지고 있다. 
 	다형성이란 동일한 조작방법으로 동작시키지만 동작방법은 다른 것을 의미한다.
 	같은 이름이지만 서로 다른 동작 방법을 가지고 있기 때문에 오버로딩은 다형성의 한 예라고 할 수 있다.

 	* 상속관계의 단일상속
	자식은 여럿이여도 부모가 하나이다. 그래서 단일상속!
	단, 인터페이스를 이용하면 다중상속과 비슷하게 만들 수도 있긴 하다.

* 자바의 포함관계 : 코드를 재사용할 수 있는 방법, 상속과는 다른 관계
				포함은 다른 클래스를 자신의 변수로 만들어 상용하는 방법
예)			
	class a{
		int aa;
	}
 	class b{
 		a temp= new a();
 	}
 
* 상속, 포함 언제 써야 하는지?
		- 상속관계 : ~은 ~이다.(is ~a) -> 알파벳 중에 A가 있다 -> A는 알파벳이다
			에어컨은 가전제품이다/ TV는 가전제품이다.
		- 포함관계 : ~은 ~을 가지고 있다. (has ~a) -> 핸드폰은 액정이 있다. -> 핸드폰은 액정을 가지고 있다.
			에어컨은 가전제품을 가지고 있다.x
			자동차는 타이어를 가지고 있다.o
 	
 	
 	
*

*/
	