package 자바0913;

public class 메소드공부6 {
// 메소드 = 기능
	/*
	 * public static : 접근제어자
	 * int : 리턴타입(리턴타입종류: 데이터타입 8개와 클래스타입 1개 +void)
	 * ***void는 리턴없는 메소드를 의미함(void하고 return하면 에러남)
	 * getSum : 메소드 이름
	 * int x, int y : 파라미터 타입 (매개변수, 인자값, 인수값...)
	 */
	
	public static int getSum(int x, int y) {
		return x+y;
	}
	
	public static void print(String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		int result=getSum(30,70);
			//예상되는 result 값은? 100
		
		/*String x = print("도시락");
		 * 리턴타입이 void인 메소드는 변수에 결가를 대입할 수 없다.
		 * return이 없기 때문에!!
		 * 실무에서는 void를 쓰긴 하나 자주 쓰진 않는다.(리턴이 없기 때문에)
		 */
		print("도시락");//으로 하면 출력가능하다.
		
	}
	

}
