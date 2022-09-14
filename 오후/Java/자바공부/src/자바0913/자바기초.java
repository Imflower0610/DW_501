package 자바0913;

public class 자바기초 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*주의점
		 * 1. 당분간 코딩은 main {}안에서 한다. (메소드 수업 전까지)
		 * 2. 실행하는 방법은 ctrl +F11을 동시에 누른ㄴ다
		 */
		
		//자바 변수 선언
		//자바는 엄격한 타입언어이다.

		int 돈 = 100; 
		//데이터가 숫자면 int
		//int : 데이터 타입
		//x: 변수이름(자바는 한글지원 가능)
		//= : 대입연산자
		///100 : 데이터
		돈=50;
		// 최종 돈 값은? 50
		int 고기 = 3;
		고기 = 10;
		//자바에서 변수 이름은 중복 될 수 없다.
		//int 고기 선언 후 다시 int 고기 안됨
		고기=5;
		고기=1;
		//최종고기는 1
		//연산자 : +,-,/,%
		고기 = 고기+3;
		//최종고기는 4
		고기=고기+고기;
		//최종 고기는 8
		int 초밥 = 5;
		초밥= 초밥*2;
		//최종초밥은 10
		초밥= 초밥/2;
		//최종초밥은 5
		
		int 내지갑 = 50000;
		int 만원몇장 = 0;
		//만원몇장 변수에 만원으로 바꿀수 있는 수를 대입하시오
		만원몇장=내지갑/10000;
		System.out.println(만원몇장);
		
		int 국어 = 80;
		int 수학 = 15;
		int 영어 = 65;
		int 평균 = 0;
		평균=(국어+수학+영어)/3;
		System.out.println("평균점수는 -> "+평균);
		/*
		 * 자바 데이터 타입 종류(일반 데이터타입 8개 + 클래스타입으로 구성됨)
		 * short, byte : 숫자
		 * int : 숫자***
		 * long : 숫자***
		 * double: 숫자(소수)
		 * float : 숫자(소수)
		 * char: 문자
		 * String: 문자*** <- 정확히 말하면 class 타입이라서 얘만 앞에가 대문자.
		 * boolean : true, false***
		 * *** 붙은게 많이 쓰는 데이터 타입
		 */
		String 이름 ="홍길동";
		이름 = 이름+"철수";
		System.out.println("이름은 =>"+이름);
		
		//문자를 숫자로 반환
		String num ="10";
		int num2 = 0;
		
		num2=Integer.parseInt(num);//문자->숫자
		System.out.println("문자에서 숫자로 변환된 값은 "+ num2);
	}

}
