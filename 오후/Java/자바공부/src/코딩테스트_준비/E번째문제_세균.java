package 코딩테스트_준비;

public class E번째문제_세균 {

	public static void main(String[] args) {
		/*
		 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 t가 매개변수로 주어질 때 
		 * t시간 후 세균의 수를 구하는 로직을 구현하시오
		 */
		int n =2; //처음 세균 마리수
		int t=10; //경과 시간
		//결과) 세균 수 :2038
		//처음엔 2마리 1시간 후엔 4마리, 2시간 후엔 8마리
		//10시간 후엔 2048이 됩니다.
		for(int i=0; i<t; i++) {
			n*=2;
			}
		System.out.println(n);

	}

}
