package house;

public class tv extends house_item{//house_item 상속받을 때
	public int inch;
	public int ch =2; //명시적 초기화
	public int sound;
	
	// 초기화 블럭에는 두가지가 있다.(초기화블럭은 생성자 메소드와는 다름!)
		static{// 클래스 초기화 블럭 - 클래스변수(static변수)만 초기화
			
		}
		{// 인스턴스 초기화 블럭 - 인스턴스 변수와 클래스 변수를 초기화
			
		}
	
	
	public tv(){
		super();
	}
	
	public tv(int p) {
		
	}
	public tv(String brand, int price, int inch) {
		super(brand, price); // super : super는 부모이다.
			// super는 자식 클래스생성자에서 가장 먼저 실행될 수 있게 해야한다.
			// 객체 생성시 객체의 초기화 순서는 부모 -> 자식 순이기 때문이다.
		this.inch= inch;
			/*
			 * 왜 super를 사용하는가?
			   생성자도 메서드이기 때문에 상속관계를 형성했다고 하더라도
			   부모객체의 생성자를 쓰기 위해서는 부모객체의 이름을 써야한다.
			   그렇기 때문에 부모객체의 메서드를 사용하기 위해
			   자식객체의 생성자 메서드에 부모객체의 변수를 사용하기 위해서 super를 사용하는 것이다.
			 */
	}
	public void buy() {
		System.out.println("TV 구매하였습니다.");
	} // 부모로부터 받은 추상메소드를 구현해야만 객체를 만들 수 있는 클래스가 될 수 있다.
	/* 
	 추상메소드가 부모에 있다면, 부모클래스는 추상클래스다.
	즉, 자식클래스는 추상클래스를 상속받는 상태가 된다.
	그러니까 자식클래스에서 추상메소드를 재정의해서 추상 메소드가 아닌 상태로 만들어야 추상클래스가 되는 걸 피할 수가 있다.
	
	-> 왜 추상클래스가 되면 안되는가?
	만약 자식클래스에서 추상메소드를 상속받는 상태로 두려면 자식클래스도 추상클래스가 되어야하고
	그렇게 되면 자식클래스를 활용하여 객체를 생성할 수가 없다
	 
 	-> 그렇다면 왜 추상클래스를 사용하는가? -> 작업시간이 단축되니까!
		- 클래스의 중복성을 제거 = 통일성을 줘서 buy= 사다의 의미로 통일가능!
		- 가독성 증가 = buy= 사다인 것만 알면 되니까 빨리 읽을 수 있다
		- 에러율 감소 
		- 유지보수 시간 단축	
	 */
}
/*
  변수의 초기화
  	* 변수초기화 방법
  		1. 생성자메서드를 통해 초기화
  			- 생성자 메서드는 객체 생성시마다 실행

  		2. 초기화 블럭을 통한 초기화
  			- 초기화 블럭은 프로그램이 로드된 뒤에 딱한번 실행
  		
  		3. 명시적 초기화
  			- 데이터를 처음에 입력하면서 데이터 값을 넣어주는게 명시적 초기화

 	* 변수 초기화 순서
 		명시적 초기화 -> 초기화 블럭 -> 생성자 메서드
 		
 	* 클래스 변수 초기화 순서
 		명시적 초기화 -> 초기화 블럭
 		
*/