package 자바1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 맵공부하기 {

	public static void main(String[] args) {

	// Map : key와 value의 쌍으로 값을 저장하는 컬렉션즈 중에 하나
		Map<String, Integer> x = new HashMap<String,Integer>();
	
	// Map 데이터 추가	
		x.put("one", 1);//왼쪽에 문자 오른쪽에 숫자
		x.put("two", 2);
		x.put("three", 3);

	// 데이터 가져오기 key를 이용해서 가져옴 
		System.out.println(x.get("one"));
		
	// 자바의 모든 클래스는 디폴트로 Object를 상속받고 있다.	
		Map<String, Object> map = new HashMap<String, Object>();
	
	//Object는 int, String, boolean 모든 데이터 타입을 받을 수 있다.
		map.put("empno", 7844);
		map.put("ename", "TURNER");
		map.put("job", "SALESMAN");
		map.put("sal", 1500);
		map.put("empno", 7839);// key는 중복될 수 없기 때문에 새 숫자로 바뀜
		
		
	//문제1. empno sal출력
		System.out.println("사원번호 : "+ map.get("empno"));
		System.out.println("급여 : " + map.get("sal"));
	
	// List 안에 Map 담을 수 있다. 왜? Map도 클래스니까
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(map);
	}

}
