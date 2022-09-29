package 자바0929;

class A{
	//기본적응로 제공 == Default
	A(){
		//메소드 => 생성자
		//생성장는 메소드와 다르게 리턴타입이 없다.
	}
	public void A클래스에있는메소드() {
		System.out.println("Hello world");
	}
	public int 메소드생성(int x) {
		return x;
	}
}
class B{
	//B라는 클래스 생성 후 메인 함수에 B클래스 호출
	B(){
		System.out.println("Hello world");
	}
//	메소드 이름은 같은ㄷ데, 차라미터 타입이 다를 때 : 오버로딩
	B(int x, int y){
		System.out.println(" B클래스 : Hello world");
	}
}

/* 클래스이름 : c
 * 필드변수 : private String 이름
 * 			private int 나이
 * 메소드 : getter, setter
 * 생성자 : String이름, int나이 파라미터가 있는 생성자 생성
 * 			파라미터가 없는 생성자 생성
 */
class C{
	// 필드변수 
	private String 이름;
	private int 나이;
	
	// 메소드 : getter, setter
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	// 생성자
	C(String 이름, int 나이){//파라미터값 있는 생성자
	}
	C(){}//파라미터값 없는 생성자
}



public class 클래스복습 {

	public static void main(String[] args) {
		// 메인메소드에서 A클래스에 있는 메소드 호출하기(2분)
		A a = new A();
//		newA(); A클래스 호출
//		A a 불러온 클래스를 a라는 변수에 대입(인스턴스화 하다(==객체를 생성하다))
		a.A클래스에있는메소드();// 변수를 생성하고 클래스 호출 시 메소드 호출
		new A().A클래스에있는메소드();
		
		A x= new A();
		x.메소드생성(300);
	
		B b = new B(5, 6);// B라는 클래스를 호출할 때 디폴트 생성자도 자동으로 호출된다.
		
	
	
	
	}

}
