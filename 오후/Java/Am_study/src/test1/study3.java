package test1;

public class study3 {

	public static void main(String[] args) {
		//이름. 연락처, 주소, 생년월일, 성별, 아이디
		//회원정보 저장하기
		member m1 = new member(); // new 연산자를 통해 member클래스의 공간을 메모리에 생성
		//m1은 참조변수라고 한다. 참조변수는 메모리 주소를 저장할 수 있는 변수를 창조변수라고 한다.
		System.out.println(m1);
	
		m1.성별="여자";
		m1.아이디= "limit";
		m1.이름= "이순자";
		m1.주소="대전 중구 선화동";
		System.out.println("아이디 : " + m1.아이디+" 이름 : "+ m1.이름 + " 주소 : "+m1.주소 + " 성별 : "+ m1.성별);
		//1. 이렇게 쓰면 귀찮으니까
		
		member m2 = new member();
		m2.성별="남자";
		m2.아이디= "eternal";
		m2.이름= "장보고";
		m2.주소="대전 동구 가양동";
		output(m2);
		//3. 간단하게 출력하기 -> 이 경우에 매개변수랑 리턴 필요할 수 있으니까 클래스 안에 함수 넣어서 하면 더 간단!
		m2.output(); //4. 클래스의 함수 출력
	}
	static void output(member m) {
		System.out.println("아이디 : " + m.아이디+" 이름 : "+ m.이름 + " 주소 : "+m.주소 + " 성별 : "+ m.성별);
	}//2. 이렇게 따로 메소드를 만들어서
	
}




/*
 *  member 클래스는 지금 study3클래스와 같은 패키지 안에 있는 클래스이기 때문에 import 안해도 된다.
 *  만약 member 클래스가 study3 클래스와 다른 패키지에 있다면 import 해야한다.
 */




//구조체 member를 만들어보자
/* struct member{
	String 이름;
	String 연락처;
	String 주소;
	String 성별;
	String id;
	int 생년월일;
	int age;
	}
*/

/*member[] m1 = new member[5];
m1.이름 ="김유신";
m1.연락처 = "010-1234-1234";
m1.주소 ="대전 중구 선화동 방산빌딩";
m1.성별 ="여";
m1.id ="limit";
m1.생년월일 =990102;
*/
// 구조체로 저장하는게 간단!
/* 구조체를 처음에 설계하는게 복잡하지만 구조체로 저장안한다면, 
 	String[] name = new String[5]<= 이런식으로 이름, 연락처, 주소,,, 일일히 만들어야함
   거기에 이메일 등 추가할 공간이 있으면, 구조체에만 추가하면 돼서 간단!
*/
/*
void getAge(int birth) {
	생년월일 계산해서 나이구하기
	* 리턴필요o 매개변수필요o
}
*/
/*
 	그러나 구조체가 복잡하고 저장만 가능한 공간이기 때문에 이를 가동하는 함수를 여러개 만들기 불편하고 
    구조체 호출하고, 함수를 호출 = 최소 두번의 호출 필요

호출시 =>  member m1; //구조체호출
		 getAge(m1.생년월일); // 함수호출
*/
// 그래서 구조체형식에 함수를 넣어서 업그레이드한게 클래스
/*class member{
	String 이름;
	String 연락처;
	String 주소;
	String 성별;
	String 아이디;
	int 생년월일;
	void getAge() {
		//age = 생년월일 계산하여 나이구하기;
		//* 리턴필요x 매개변수x
	};
	}
*/
//호출시 => m1.getAge();//클래스에서 호출





