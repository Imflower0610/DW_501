package 자바0913;

public class 메소드공부5 {
	
/*
 * public static : 접근 지정자
 * int : 리턴타입
 * getSum : 메소드 이름
 * int x, int y : 파라미터 값, 매개 변수, 인수 값.....
 */
	public static int getSum(int x, int y) {
		return x+y;
	}

/*
 * public static : 접근지정자
 * boolean : 리턴타입
 * isLogic : 메소드 이름
 * boolean isLogic : 파라미터 값
 */
	public static boolean isLogic(boolean isLogic) {
		return isLogic;
	}
	/*
	 * public static : 접근지정자
	 * String : 리턴타입
	 * getWord :메소드 이름
	 * String word :파라미터 값
	 */
	public static String getWord(String word) {
		return word;
	}
	
	public static void main(String[] args) {
		int result = getSum(10,10);
		System.out.println("결과 : "+result);
//		문제1. 예상되는 result값은? 20
		boolean isResult =isLogic(true);
		System.out.println(isResult);
//		문제2. 예상되는 result값은? true
		String word=getWord("치즈돈까스");
		System.out.println(word);
//		문제3. 예상되는 result값은? 치즈돈까스
	
	}

}
