package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		/*for문 실행순서
		  * 1.int i=0
		  * 2.i<10
		  * 3.코드실행
		  * 4.i++
		  */
//		int i=0;
//		for(i=0; i<10; i++) {
//		 }
//		System.out.println(i); 
		//i는 for문 끝낼때 같이 끝남으로 따로 i를 빼서 정해주면 사용가능
		
		Scanner	scan = new Scanner(System.in);
		System.out.println("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은"+num);
		
//문제1번 num에 값을 입력 받았을 때 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 n을 출력하시오
		int x=0;
		if(num>=3 && num<=1000) {
			for(int i=1; i<num; i++) {
					if(num%i==1){
						x=i;
						System.out.println(x);
						break;
					}
			}
		}
		
		
		
	}

}
