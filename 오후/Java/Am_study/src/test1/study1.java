package test1;

import java.util.Arrays;
import java.util.Scanner;
public class study1 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
/*
 * 자바 데이터 타입
 * 정수타입- byte, short, int, long
 * 실수타입- float, double
 * 문자타입- char
 * 논리타입- boolean
 */
			/*
			int num;
			num= sc.nextInt();
				//nextFloat(); - float 타입
			byte b = sc.nextByte();
			short s = sc. nextShort();
			long l = sc.nextLong();
			float f =sc.nextFloat();
			double d =sc.nextDouble();
			boolean bool=sc.nextBoolean();
			char ch=sc.nextChar();
			*/
			//국어, 수학, 영어 점수 입력 받아서 총점과 평균 출력 구하기
			int kor, mat, eng;
			System.out.println("국어점수 : ");
			kor = sc.nextInt();
			System.out.println("수학점수 : ");
			mat = sc.nextInt();
			System.out.println("영어점수 : ");
			eng = sc.nextInt();
			int sum = kor+mat+eng;
			int avg = sum/3;
			System.out.println("총점은 "+ sum + ", 평균은 " + avg);
			
			/* 배열
			 * 	const arr =[], const arr2= new Array();
			 * 자바에서 1차원 배열 생성하기
			 * 	타입[] 배열이름 = new 타입[배열크기];
			 */
			int[] score = new int[5];
			score[0]=10;
			score[1]=20;
			score[2]=30;
			score[3]=40;
			score[4]=50;
			
			System.out.println(score[0]);
			
			for( int i =0; i<score.length; i++) {
				System.out.println(score[i]);
			}
			String[] name = new String[3];
			for(int i=0; i< name.length; i++) {
				System.out.println("이름입력 : ");
				name[i] = sc.nextLine();
			}
			for(int i =0; i<name.length; i++) {
				System.out.println(name[i]);
			}
			Arrays.sort(score);
			int[] temp = new int[10];
			//arraycopy(복사할 배열, 복사배열시작인덱스, 저장되는 배열, 저장배열 시작인덱스)
			System.arraycopy(score,0,temp,0,score.length);
			
			System.out.println(Arrays.toString(temp));
			//score[5]=60;
			}
}
