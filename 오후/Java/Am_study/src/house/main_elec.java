package house;

import java.util.List;

public class main_elec {

	static List<house_item> list = null;
	
	public static void init(){
		file f = new file("c:/test/electronic.txt");
		list = f.load();
	}
	
	
	
	public static void main(String[] args) {
		init();
		for(house_item item : list)
		System.out.println(item.toString());
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