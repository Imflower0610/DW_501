package 자바0913;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) 
{
//		int x=10;
//		if(x==10) {System.out.println("A");}
//		//if= 조건
//		// = (대입연산자), == (같다), != (다르다)
//		
//		//새로 배운 개념
//		if(x==10) {
//			int y = 0;//여기서 태어나서
//		}//여기서 사라짐
//		System.out.println(y);//y를 불러올 수 없음
//		
//		int a=3;
//		if(x>3) {
//			a=10; 
//			int y=20;
//		}//a = 3, y= 사라짐
//ctrl + shift + o = 자동임포트
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은"+num);
		
//받아온 값이 짝수면 짝수입니다. 홀수면 홀수입니다. 출력해보시오!
		if(num%2==0) {System.out.println("짝수 입니다.");}
		else {System.out.println("홀수 입니다.");}
		
		
}
}
