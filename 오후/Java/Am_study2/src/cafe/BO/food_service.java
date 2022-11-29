package cafe.BO;

import java.util.Map;
import java.util.Scanner;

import cafe.DAO.food_DAO;
import cafe.VO.food;
import cafe.VO.order_list;
import cafe.main.cafe_main;

public class food_service {
	private food_DAO fdao = new food_DAO();
	private Scanner sc = new Scanner(System.in);
	public boolean order_food(int seq) {
		//음식 주문하면 실행되는 메서드
		// 주문 한 음식을 db와 비교하여 해당음식의 조리시간, 금액, 알러지 등의 정보를 제공
		Map<Integer, food> map = fdao.food_list();
		if(map!=null) {
			food my_Order = map.get(seq);
			System.out.println("주문 음식 : " + my_Order.getFood_name());
			System.out.println("조리시간 : " + my_Order.getCook_time());
			System.out.println("금액 : " + my_Order.getCost());
			System.out.println("알러지 : " + my_Order.getAllergy());
			System.out.println("칼로리 : " +my_Order.getCal());
			
			String []tmp =cafe_main.user.getAllergy().split(",");// 회원 가입할 때 입력시 알레르기 ,로 구문하기
			
			for(String all : tmp) {
			if(my_Order.getAllergy().contains(all) && !(tmp.equals("x"))) {
					System.out.println("주문하신 음식은 알레르기 유발음식입니다.");
					System.out.println("계속 주문하시겠습니까?(y/n)");
					if(sc.nextLine().equals("n")) 
						return true;//알레르기 때문에 다른 음식 주문하는 경우
					
				break;// 음식에 알레르기 성분 나왔으니 비교하는 거 멈추기
			}
		}//반복문이 정상적으로 종료되면 주문을 계속 진행
		
		// 주문 내역 db에 저장하기 위한 코드 작성
			System.out.println("주문 요청사항 : ");
			String memo = sc.nextLine();
			order_list cont = new order_list(my_Order.getFood_name(),
					cafe_main.user.getId(),my_Order.getCost(),memo);
			// order_list 클래스의 객체에 주문내역 저장하기
			// 주문음식 이름, 주문자, 주문금액, 요청사항 순으로 저장하기
			// food_service.주문 음식은 위에서 my_order라는 이름으로 food_DAO를 통해 db에서 가지고 왔음
			// 주문자 정보는 로그인하면 user에 저장되어있다.
			fdao.order_insert(cont);
	}
		else {
			System.out.println("관리자에게 문의하세요");
			return true;//프로그램 코드(DB문제)가 실행되지 않는 경우
		}
		return false;//정상적으로 주문처리가 된경우
		}
	
}