package house;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class buyer {
	private int money=10000000;
	private String name = "장영주";
	private String special_note="발부상";
	private List<house_item> buy_list=null;//구매한 제품 목록으로 저장
	
	{//인스턴스초기화블럭
		special_note="목발하나만 필요";
	}
	public buyer() {
		buy_list = new ArrayList<>();
		special_note="두발로 걸어다님";
		}
	
	// 매개변수 다형성
	public void buy(house_item item) {
		if(money<item.price) {
			System.out.println("돈이부족합니다. 목발을 팔아주세요");
			return;
		}
		buy_list.add(item);
		money-= item.price;
		// 세자리마다 ',' 찍혀나오게 하기 첫번째 방법
		DecimalFormat df = new DecimalFormat("###,###");//세자리마다 ,찍혀나오게 하기 1
		System.out.println("현재 잔액 :"+df.format(money)+"원");
		/* 세자리마다 ',' 찍혀나오게 하기 정규식사용
			Integer.toString(money).replaceAll("\\B(?=(\\d{3})+(?!\\d))",","); d : 숫자
		 	* Integer.toString() 정수를 문자로 바꾸기
		*/
	}
	public void buylist() {
		for(house_item item : buy_list) {
			System.out.println(item.toString());
		}
	}
	   
	
	/* 다형성으로 클래스 구성을 만들지 않았다면
	  public void buy(tv t) {}
	  public void buy(aircon air) {}
	  public void buy(computer com) {}
	 * 이런식으로 세개 다 만들어서 오버로딩 해야함
	 */
		
	

}
