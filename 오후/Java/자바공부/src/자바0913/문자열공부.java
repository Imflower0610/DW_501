package 자바0913;

public class 문자열공부 {

	public static void main(String[] args) {
		String name ="황정민";//문자
		String name2 ="하정우";
		//자바는 문자를 비교할때 ==을 사용하지 않는다.
		name.equals("황정민");//이렇게 비교함
	
		//1. 문자 비교하기
		boolean isCheck=name.equals(name2);
		// 왜? 자바에서는 문자를 ==연산자로 비교하지 않고
		// equals를 사용하는 이유는 자바에서 문자열은 클래스이기 때문에
		// ==연산자로 비교하게 되면 문자를 비교하는게 아니라 클래스를 비교하는 것이 된다.
		System.out.println("name과 name2를 비교한 결과 => "+ isCheck);
		//boolean은 true or false만 표현할 수 있다.
		
		//2. 문자 길이 알아내기
		String 비밀번호 = "12341234";
		int 문자길이 = 비밀번호.length();
		System.out.println("문자길이는 =>"+문자길이);
		
		//3. 문자 자르기
		String 핸드폰번호 = "010-8888-1222";
		String 배열[] = 핸드폰번호.split("-");//"-"를 기준으로 자르겠다.
		System.out.println(배열[0]);
		System.out.println(배열[1]);
		System.out.println(배열[2]);
	
		//4.특정문자만 추출하기
		String 영화제목 = "어벤져스 인피니티 워";
		String 결과는 = 영화제목.substring(2);//어벤 이후 문자 보여줌
		String 결과는2 = 영화제목.substring(0,4);//어벤저스만 나오게한다
		System.out.println(결과는);
		System.out.println(결과는2);
		
	}

}
