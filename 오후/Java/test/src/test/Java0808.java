package test;

public class Java0808 {

	public static void main(String[] args) {
		int number = 50;
		System.out.println(number);
		
		//<--주석
		//(주석) int는 데이터타입이고 age는 변수이름이다.
		//데이터 타입은 정해져있다 이름변경 불가능.
		//변수이름은 자유롭게 수정 가능.
		//프로그래밍에서 = 같다가 아니라 대입을 의미함.
		//데이터타입이 int(숫자)이기 때문에 숫자만 대입할 수 있다.

		//문제1. 데이터타입은 int 변수이름은 money라고 마늘고
		//500을 대입하시오.
		int money = 500;
		//마지막에 ;을 찍어야 컴퓨터가 코드를 실행할 수 있다.
		System.out.println(money);//출력
		//저장(Ctrl+s)->>실행(Ctrl+F11)
		String 이름 = "김지연";//데이터타입 String(문자)
		System.out.println("당신 이름은 ?"+이름);
		String 사는곳 ="대전";
		System.out.println("제가 사는 곳은 ?"+사는곳);
		//문제2. 데이터타입 String 변수이름 취미
		//취미데이터를 대입 후 출력!
		
		String 취미 ="퍼즐";
		System.out.println("취미는 ?"+취미);
		
		//프로그래밍을 위에서 아래로 해석한다.
		int x = 10;//x라는 변수를 선언(x라는 이름은 한번썼으니 중복이 안됨)
		System.out.println("x의 값은?"+x);
		x=20;//기존에 있던 10은 없어지고 20이 들어간다.
		System.out.println("x의 값은?"+x);
		//문제3. 아래 예상되는 결과를 메모창에 작성하시오
		x=50;
		System.out.println("x의 값은?"+x);
		//정답50 컴퓨터는 위에서 아래로 읽기 때문에 최종적으로 50이 됨
		//대입은 기존 데이터를 무시하고 새로운 데이터를 넣을 수 있다.
		// '=' <= 대입연산자
		///+,-,/(나누기 몫값),%(나누기 나머지값),=(대입) 연산자 종류
		
		int a = 5; // 5를 데이터타입 int a변수에 대입
		int b = 10;// 10을 데이터타입 int b변수에 대입
		int c = a+b;// a와 b를 더한 값은 데이터타입 int c변수에 대입
		System.out.println("최종값은? "+c);
		//문제 4. 10-7을 구현하는 로직을 아래 작성하시오
		int d = 10;
		int e = 7;
		int f = d-e;
		System.out.println("최종값은?"+f);
		
	}
}
