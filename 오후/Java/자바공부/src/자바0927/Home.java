package 자바0927;

class A{//A 클래스 시작
	int value = 100;//value 탄생 (필드 변수)
	/*
	 * 필드변수 특징
	 * 1. 전역(전체)으로 활용가능
	 * 2. 초기값을 지정하지 않아도 된다.(기본값(default 값)이 존재)
	 */
	
	public void 확인하기() {
		int x = 50;// x라는 이름의 변수 탄생
		int y;// y에 값이 없어서 y를 출력 or 사용시 오류 발생
		System.out.println("A클래스에 있는 메소드 입니다.");
		System.out.println(value);	
	}//x생을 마감
}//A 클래스 끝 value 생을 마감
/*
 * B이름을 가진 클래스 생성
 * 리턴 값이 void고 파라미터 타입이 없는 확인하기 메소드 생성
 * 메인메소드에서 B클래스에 있는 확ㅇ인하기 메소드 호출하기
 * 결과 :  B클래스에 있는 메소드 입니다.
 */

class B{
	public void 확인하기() {
		System.out.println("B클래스에 있는 메소드 입니다.");
	}
}
/* 클래스 이름 : c
 * 필드변수 : String str, int value
 * 1.메소드: 
 * 리턴타입 : boolean
 * 메소드 이름: 메소드 만들기
 * 파라미터 타입 : 없음
 * 
 * 2.메소드: 
 * 리턴타입 : int
 * 메소드 이름: 메소드 만들기
 * 파라미터 타입 : double x, double y
 */
class C{
	String str;
	int value;
//	리턴 타입이 있으면 리턴을 꼭써줘야 한다.
//  접근제어자 public static 사실 optional이다.
	public boolean 메소드만들기() {
		return true;//true or false return
	}
	public int 메소드만들기(double x, double y) {
		return 0;
	}
//	클래스 b를 리턴하겠다.
	B 메소드만들기(B b) {
		return b;
	}
}
public class Home {
	public static void main(String[] args) {
		A a클래스 = new A();//new A() => A클래스를 호출하다.
		a클래스.확인하기(); // a클래스에 있는 호가인하기 메소드(==함수) 사용
		B b= new B();
		b.확인하기();
	}
	
}
//변수 생성시 아무 값이라도 넣어야 오류가 발생하지 않는다. 
//단, 필드 변수는 기본값(default 값)이 존재해서 오류 발생하지 않는다.