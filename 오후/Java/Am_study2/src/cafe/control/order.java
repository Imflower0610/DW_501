package cafe.control;

import java.util.Scanner;

import cafe.BO.food_service;
import cafe.main.cafe_main;

public class order implements menu_able{

	@Override
	public boolean menu_active() {// 인터페이스가 가지고 있는 메서드
		// 로그인 하지 않으면 주문 못함 메뉴도 못본다.
		// 로그인 하면 볼 수 있다.를 만들기
		food_service food = new food_service();
		if(cafe_main.user==null) {// 로그인하지 않응면 user는 null
			System.out.println("로그인을 먼저 해주세요");
		}else {
			while(food.order_food(menu()));
		}
		return true;
	}
	private int menu() {
		String[] mlist = {"안먹고싶음","닭볶음탕","코코볼","보쌈","조개찜","불고기",
					"건빵후레이크","김치국","연어초밥","열라면","순두부찌개","불족발",
					"당당치킨","까르보나라","마라탕","부대찌개"};
		int i = 1;
	for(String m : mlist) {
	 System.out.println(i+". "+m);
	i++;}
	System.out.println("선택 : ");
	return new Scanner(System.in).nextInt();
	
	}

}


/* 오버로딩과 오버라이딩
 	* 오버로딩 : 클래스내부에서 메서드 이름은 같고, 매개변수가 다른 형태로 메서드를 정의하는 것
 			  => 새로운 메서드를 정의하는 것
 			  ex) - int a(int num){}
 			  	  - int a(int num, int num2){} 
 			  	  - void a(String name){} // 리턴타입 달라도 됨
 			  	   
 	* 오버라이딩 : 다른 클래스(자식 또는 implements 되어 있는 클래스)에 
 				리턴타입, 메서드이름, 매개변수 모두 똑같이 정의하고 내용만 다르게 만드는 메서드
 			  	=>  기존의 메서드를 내용만 변경하는 것( overriding : 덮어쓰기 )
 			    ex) - 
 */
 