package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.VO.member;
import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	static Scanner sc = new Scanner(System.in);
	public static member user = null;
	
	public static void main(String[] args) {
		
	// 부모클래스가 없어도(상속 아니여도) 인터페이스를 연결하면 다형성 가능!
	//	order o = new order();
	//	login l = new login();
	//	event e = new event();
	
	menu_able[] menu = {new order(), new login(), new event(), new signin(), new exit()};
	
//		while(true) {
////			switch(main_menu()) {
////			case 1://주문
////				break;
////			case 2://로그인
////				break;
////			case 3://이벤트확인
////				break;
////			case 4://회원가입
////				break;
////			case 5://종료
////				break;
////			}
//		menu[main_menu()-1].menu_active(); //이렇게 배열로 하면 switch 안써도됨
//		}

	while(menu[main_menu()-1].menu_active());}// true false 이용해서 더 간단하게 줄일 수 있음
	
	public static int main_menu() {//클래스 메서드 - 클래스 메서드에서만 사용
		int select = 0; 
		
		String[] menu = {"주문","로그인","이벤트","회원가입","종류"};
		
			try{
				for(int i=1; i<=menu.length; i++) {
					if(user!=null && (i==2||i==4))
						continue;
					System.out.println(i+"."+ menu[i-1]);
				}
//				System.out.println("1. 주문");
//				System.out.println("2. 로그인");
//				System.out.println("3. 이벤트");
//				System.out.println("4. 회원가입");
//				System.out.println("5. 종료");

				System.out.println("선택 : ");
				select = sc.nextInt();
				if(select<1 || select>5)
					throw new InputMismatchException("잘못입력했습니다.");
			}catch(Exception e) {// if안할꺼면 InputMismatchException으로 해도됨
				System.out.println(e.getMessage());
				sc.nextLine(); // 이걸 안하면 문자 입력시 에러가 뜰 수 있음
				select = main_menu(); // 재귀호출 : 자기 안에서 스스로 호출 => 리턴 나올때까지 자기 자신을 계속 실행
									  // 잘못입력시 다시 선택할 수 있게 동작하는 것
				
			}
		return select;
	}
	//Scanner : 키보드를 통해 입력값 받음
	// sc.nextInt에서 문자 입력시, int는 숫자만 받는데 문자 입력하면 엔터가 입력버퍼에 남고
	// 엔터가 숫자자리에 억지로 문자를 넘겨줘서 에러가 뜰 수 있음 => sc.nextLine으로 입력버퍼를 비워줘야함
}