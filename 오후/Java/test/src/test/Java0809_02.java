package test;

public class Java0809_02 {

	public static void main(String[] args) {//중괄호시작
		// TODO Auto-generated method stub
		int x = 10;
		x=x+x;//x=20
		//x+=x는 x=x+x랑 같은 의미
		++x;//+1하겠다
		System.out.println("x의 값은 : "+x);
		
		//if
		if(2<4) {
			System.out.println("if 실행!");
		}
		
		int 숫자1 = 100;
		int 숫자2 = 200;
		int 숫자3 = 50;
		if(숫자1==숫자2) {//==같다
			System.out.println("숫자1하고 숫자2는 같습니다.");
		}
		
		if(숫자1!=숫자2) {//!=다르다
			System.out.println("숫자1하고 숫자2는 다릅니다.");
			숫자3=100;
		}
		System.out.println("숫자3 : "+숫자3);
		
			

	}//중괄호끝

}
