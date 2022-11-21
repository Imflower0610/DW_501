package house;

import java.util.List;
import java.util.Scanner;

public class main_elec {

	static List<house_item> list = null;
	
	public static void init(){
		file f = new file("c:/test/electronic.txt");
		list = f.load();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init();
		buyer jyj = new buyer();
		
		//for(house_item item : list) 
		//System.out.println(item.toString());
	
		//1.tv 2.에어컨 3.컴퓨터 선택할 수 있는 메뉴 띄우고 3개중에 하나 선택하면 해당 제품 출력
		while(true){//6.계속 선택가능
			System.out.println("1.tv 2.에어컨 3.컴퓨터 중 하나를 선택하세요");//1. 선택창 출력
			int select = sc.nextInt();//2. 선택값저장
			int i = 1;
		
			//제품번호 출력
			for(house_item item : list) {//3. for 문으로 list가져와서
				switch(select) {// 4.instanceof로 타입 선택
					case 1: //5.타입별로 출력
						if(item instanceof tv)
						System.out.println(i+"."+item.toString());
						
						break;
						
				
					case 2:
						if(item instanceof aircon)
							System.out.println(i+"."+item.toString());
					
						break;
				
					case 3:
						if(item instanceof computer)
						
							System.out.println(i+"."+item.toString());
						
						break;
				}
				i++;
			}
			
			
			//제품번호 선택
			boolean flag = false;// 구매제품이 선택한 제품종류와 일치하는가?
			do {
			System.out.println("구매할 제품 선택(구매 x : 0) : ");
			int item_num = sc.nextInt();
			if(item_num==0)continue;
			else {
				switch(select) {// 구매제품이 선택한 제품종류와 일치하는가?
				case 1:
					if(!(list.get(item_num-1) instanceof tv))
						flag = true;
					break;
				case 2:
					if(!(list.get(item_num-1) instanceof aircon))
						flag = true;
					break;
				case 3:
					if(!(list.get(item_num-1) instanceof computer))
						flag = true;
					break;
					}
				if(flag)continue;
				jyj.buy(list.get(item_num-1));// 구매제품이 선택한 제품종류와 맞지 않으면 처음부터
				}
			}while(flag);
			
			System.out.println("추가구매?(0,1) : ");
			int end = sc.nextInt();
			if(end==0)break;
	
			// 1. TV제품 구매하는데 제품번호가 TV가 아니면 다시 선택하게 만들기
			// 2. 제품 구매 후에 추가로 구매할 것인지 의사를 물어보고 계속구매, 중지 만들기
			// 3. 구매를 더이상 하지 않는다면 지금까지 구매한 제품들 모두 출력하기
		}//제품구매반목문
		jyj.buylist();
	}
	}

/* Static 메서드에서 사용가능 한 것
 	* Static 메서드
 	* Static 변수 
*/
/*
 * Instance 메서드에서 사용가능한 것
 	* Static 메서드
 	* Static 변수
 	* Instance 메서드
 	* Instance 변수
 */
/*
 * 실체화하여 실행ㅇ할 것인가, 실체화 하지않고 호출할 것인가?
 * 아파트를 건설하기 위해 설계도를 작성한다 => 클래스구현
 * 아파트를 분양하기 위해 모델하우스를 짓는다 => static
 * 설계도를 보고 아파트를 짓는다 => 인스턴스
 */
		
// 인스턴스 메서드는 인스턴스가 생성되어야 호출이 가능하다.
// 그렇게 호출되도록 코드로 구별을 해주었고 그렇게 동작하도록 자바머신에서 인식하기 때문
// jvm - 자바저장 머신