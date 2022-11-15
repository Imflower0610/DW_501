package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import test1.member;

public class main1 {

	public static void main(String[] args) {
		// member[] arr = new member[5];
		List<member> list = new ArrayList<>();
		
		list.add(new member());
		list.get(0).성별="남자";
		list.get(0).아이디 = "end";
		
		member m = new member();
		
		member[] arr = new member[5];
		// 클래스 타입의 배열을 만들어 준다. 
		// => 클래스타입의 배열 생성하면 배열의 각 공간은 클래스타입의 참조변수 공간이다. 클래스공간은 아직 안만들어진 상태
		arr[0]= new member(); // 그래서 이렇게 참조변수에 클래스 공간 생성해준 뒤에
		arr[0].아이디 = "li"; // 채워줘야함
		arr[0].성별="여자";
		arr[0].주소 = "대전서구 둔산동";
		arr[0].이름="윤재영";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=new member();
			System.out.println("아이디 : ");
			arr[i].아이디 = sc.nextLine();
			System.out.println("이름 : ");
			arr[i].이름 = sc.nextLine();
			System.out.println("주소 : ");
			arr[i].주소 = sc.nextLine();
			System.out.println("성별 : ");
			arr[i].성별 = sc.nextLine();
		}
		for(member temp:arr) {
			temp.output();
		}
		final int a =10;
		//a =20; 해도 변경 안됨
		
		/*
		 * 제어자
		 
		 	* final - 변경할 수 없는
		  
		 	* static - 클래스의 ... 
		  
		  		static 변수
		  		  	- 모든 인스턴스에 공통적으로 사용되는 클래스 변수
		  		  	- 클래스 변수는 인스턴스를 생성하지 않고도 사용가능(=new 생성안해도 됨 )
		  		  	- 클래스가 메모리에 로드될 때 생성된다.
		  		static 메서드
		  		  	-인스턴스를 생성하지 않고도 호출이 가능한 static메서드
		  			-static메서드에서는 인스턴스변수와 인스턴스 메서드 사용불가(만들어진 시점이 다르므로)
		  
		 	* abstarct - 추상적인, 추상화 작업
		 
		  
		 * 접근제어자
		 	
		 	* public - 제한없이 사용가능, 클래스, 변수, 메서드
		 	
		 	* default - 아무것도 붙이지 않은 기본적인 형태, 같은 패키지에서만 사용가능
		 	
		 	* protected - 같은 패키지에서만 사용가능, 상속인 경우 제외
		 	
		 	* private - 같은 패키지라도 사용불가, 누구든 사용불가, 오직 해당 클래스내부에서만 사용가능
		 * 
		 */
		
	
	
	}
	
}
