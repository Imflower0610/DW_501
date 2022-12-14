package 자바0913;

public class 메소드공부4 {

	/*
	 * public static : 접근제어자
	 * String(문자)/int(숫자)/boolean(true/false)/double(소수점) : 리턴타입
	 * getWorl/getSum: 메소드(혹은 함수 이름)
	 * String/int x : 파라미터 타입 혹은 매개변수
	 */
	
	/*
	 * 메소드 사용하는 이유
	 * 1. 업무 분담
	 * 2. 유지보수 편리성 
	 */
	
	/* public static : 접근제어자
	 * boolean: 리턴타입
	 * isTrue: 메소드 이름
	 * 파라미터 값 없음
	 */
	public static boolean isTrue() {
		return true;
	}
	
	
	public static int getCount(int startNum, int endNum) {
		//문제1 startNum이 endNum보다 크면 startnum 리턴
		//endNum이 startNum보다 크면 endNum 리턴
		if (startNum>endNum)return startNum;
		if(endNum>startNum) return endNum;
		return 0;
	}
	public static int 일부터십까지합구하기() {
		//1~10까지 합을 구하는 로직을 구한 후 합을 리턴
		int sum=0;
		for(int i=1; i<=10; i++) {
		sum+=i;
		}
		return sum;
		
	}
	public static int 짝수갯수구하기() {
		//1부터 20까지 짝수 갯수 구하고 리턴하기
		int count=0;
		for(int i=1; i<=20; i++) {
		if(i%2==0){count++;}
		}
		return count;     
	}
	
/*문제3
 * 1937년 collatz란 사람에 의해 제기된 이 추측은 주어진 수가 1이 될때까지 다음 작업을 반복하면
 * 모든 수를 1로 만들수 있다는 추측입니다. 작업은 다음과 같습니다.
 * 1-1 입력된 수가 짝수라면 2로 나눈다
 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다
 * 2. 결과로 나온 수에 같은 작업을 1이 될때까지 반복한다
 * 주어진수가 6이라면
 * 6→3→10→5→16→8→4→2→1 이 되어 8번만에 1이 된다
 * 위 작업을 몇번이나 반복해야 하는지 리턴하는 메소드solution을 완성해주세요
 * 단 주어진 수가 1인 경우에는 0을
 * 작업을 500번 반복할때까지 1이 되지 않는다면 -1을 리턴에주세요
 * hint(while사용)
 * long=8바이트 int=4바이트(2^32 넘어가면 표현X)
 */
	public static long solution(long n) {
		long answer =0;
		if(n==1) answer=0;
		while(n>1) {
			if(n%2==0) {
				n=n/2;
				answer++;

			}
			else if(n%2==1) {
				n=n*3+1;
				answer++;
			}
		}
		if(answer>=500) answer=-1;		
		return answer;
	}
/*
 * bit : 표현할 수 있는 수 256
 * byte : 8bit => 1byte
 * KB :
 * MB :
 * GB : 1024GB => 1TB
 * TB :
 */
	
	
	public static void main(String[] args) {
		// 1. 1~10까지 합
		// 2. 10까지 짝수를 구하시오
	getCount(1,10);//메소드를 불러오다(메소드호출)
	
	System.out.println(solution(626331 ));
		
	}

}
