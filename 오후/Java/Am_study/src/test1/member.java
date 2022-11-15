package test1;

public class member {
	
	public static int count; //클래스 변수
	
	public String 아이디; //인스턴스 변수
	public String 이름; //인스턴스 변수
	public String 주소; //인스턴스 변수
	public String 성별; //인스턴스 변수
	
	public member() {}
	
	//생성자메소드
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별=성별;
		this.아이디=아이디;
		this.이름=이름;
		this.주소=주소;
	}
	
	public void output() {
		System.out.println("아이디 : " + 아이디+" 이름 : "+ 이름 + " 주소 : "+주소 + " 성별 : "+ 성별);
		}
}

/*
 * 자바 변수
 * 지역 변수 - 변수 선언한 중괄호 안에만 존재하는 변수
 			생성 : '{' 시작시 생성
 			종료 : '}' 종료시 종료
 * 인스턴스 변수 - 클래스 내에 만들어진 변수
  			생성 : 클래스 객체 생성시
 			종료 : 클래스 객체 종료시
 * 클래스 변수 - 클래스 내에 static 붙어서 만들어진 변수
 			생성 : 프로그램 로드
 			종료 : 프로그램 종료
 
 * 인스턴스 변수와 클래스 변수의 차이
 - 인스턴스 변수 : 객체 생성시마다 숫자 늘어남
 - 클래스 변수 : 객체생성 전에 만들어졌기 때문에 객체 수와 상관없이 클래스 하나에 하나만 존재
  			= 클래스 변수는 객체들의 공유공간
 */
