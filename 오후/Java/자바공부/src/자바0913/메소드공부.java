package 자바0913;

public class 메소드공부 {

//	public static void main(String[] args) {
		//메소드 : 뭔가를 수행하는 기능
		//javascript function이랑 똑같은 개념
//		()=> 파라미터 or 매개변수
//		public static 지금은 몰라도 됨
//		int : return 타입
//		더하기 : 메소드 이름(기능 이름)
	public static int 더하기 (int x, int y){
			return x+y;
		}
	public static int 빼기 (int x, int y){
		return x-y;
	}
	public static int 나누기 (int x, int y){
		return x/y;
	}
	public static int 곱하기 (int x, int y) {
		return x*y;
	}
	public static void main(String[] args) {
		int 결과 = 더하기(20, 10);
		System.out.println(결과);
		int 결과2 = 빼기(30, 5);
		System.out.println(결과2);
		int 결과3 = 나누기(30, 5);
		System.out.println(결과3);
		int 결과4 = 곱하기(30, 5);
		System.out.println(결과4);
		
		
	}
	
		
		
		

	}

