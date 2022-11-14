package 자바1114;

//html == div  라고 이해~!
//div가 모여서 사이트 페이지 완성
//java에서는 class들이 모여서 프로그램 완성
class 월드컵{
	String 출전국가;
	String 선수명단;
	String 개최지;
	
	// 생성자 : 리턴이 없는 메소드, 클래스 호출 시 초기화할 때 사용
	// 생성자 이름은 클래스 이름과 동일해야함
	월드컵(String 출전국가, String 선수명단 , String 개최지){
		//파라미터로 받아온 값을 필드변수에 대입하기
		this.출전국가 = 출전국가;
		this.선수명단= 선수명단;
		this.개최지 = 개최지;
	}
	
	//클래스 안에서 메소드 만들어보기
	String 출전국가알아내기() {
				return "우루과이";
	}
	String 개최지알아내기() {
		return this.개최지;// this == 자신 == 현재 메소드가 포함되어져있는 클래스
	}
}
public class 클래스복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 만든 클래스 main함수에서 호출하기
		// 객체지향 프로그래밍에서는 클래스도 데이터 타입이다.
		월드컵 a = new 월드컵("프랑스", "디디에 데상 외 몇명","카타르");
		// new 월드컵(); 에러나는 이유=> 생성자ㅇ에 파라미터 변수를 정의했기 때문
		// 생성자는 함수와 동일하지만, 리턴타입이 없고 메소드이름은 클래스이름과 동일해야함
System.out.println(a.개최지);
System.out.println(a.선수명단);
System.out.println(a.출전국가);

		// 클래스에 오는 변수를 *필드변수하고 함
		a.개최지 = "카타르";
		a.선수명단 = "대한민국 선수단";
		a.출전국가 = "대한민국";
		
		//데이터 출력하기
		System.out.println("개최지 ===> "+ a.개최지);
		System.out.println("선수명단 ===> "+ a.선수명단);
		System.out.println("출전국가 ===> "+ a.출전국가);
		// ctrl +f11 실행
	
	//출전국가알아내기 메소드의 리턴타입은 String~!
	String 출전국가 = a.출전국가알아내기(); // 클래스에서 정의한 메소드 호출
	String 개최지 = a.개최지알아내기();
	
	System.out.println("메소드로 가져온 값 ===>"+출전국가);
	System.out.println("메소드로 가져온 값 ===>"+개최지);	}

}
