package 코딩테스트_준비;

public class 두번째문제 {

	public static void main(String[] args) {
		 int n = 64; //양꼬치
		 int k = 6; //음료수
		 int result = 0; //지불 금액
		 
		 final int 양꼬치 = 12000;
		 final int 음료수 = 2000;
		 final int 서비스음료 = 10;
		 
		 int 서비스음료수 = n/서비스음료;
		 int 제외가격 = 서비스음료수*음료수;
		 result = n*양꼬치+k*음료수-제외가격;
		 System.out.println(result);
	}

}
