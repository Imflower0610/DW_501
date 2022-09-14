package test;

public class Java0808_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;//5를 대입
		a = a;//5를 다시 대입(=a=5)
		a = a * a;///a*a를 a에 대입(5*5)
		System.out.println(a);
		
		int b = a;
		System.out.println(b);
		
		//문제5
		//int a = 5;
		//int b = a;
		//System.out.println(b);
		  //b=5
		
		//문제6
		//int a = 2;
		//a = a;//
		//a = a * a;///
		//int b = a;
		//System.out.println(b);
		  //b = 4

		int c = 10 / 2;//나누기 몫
		System.out.println("4번. "+c);
		int d = 10 % 2;//나누기 나머지
		System.out.println("5번. "+d);
		int f = 5*5;//곱하기
		System.out.println("6번. "+f);
		
	}

}
