package 코딩테스트_준비;

public class 첫번째문제 {

    
	public static void main(String[] args) {
		int money = 15000; //가지고 있는 돈
	    int 잔수 = 0;
	    int 남은돈 = 0;
	    final int Americano=5500;
	     잔수 = money/Americano;
	     남은돈 = money%Americano;
	     System.out.println("잔 수 : " + 잔수 + ", 남은 돈 : " + 남은돈);

	}

}
