package test1;

public class study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("나는 자바다.");
			
		// 출력방법
			System.out.println("출력방법1"); // 한줄 출력 -> 줄바꿈 기능있음
			System.out.print("출력방법2"); // 줄 안바뀌고 연속 출력
			System.out.printf("출력방법3"); // 포맷, 출력하고자 하는 데이터의 형식을 설정
			
			System.out.printf(" %d  %f  %s  \n 줄바꿈도 된다. \n\n ㅋ",100,3.14,"자바");
			//	%d = 정수
			//	%f = 실수
			//	%s = 문자열
			System.out.println("   "+100+"   "+3.14+"   자바   ");
			System.out.println("줄바꿈도 된다.");
		// 한줄주석
		/*
		 * 여러줄 주석
		 */
	}

}
