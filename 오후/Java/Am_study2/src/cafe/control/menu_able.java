package cafe.control;

@FunctionalInterface
public interface menu_able {
	
	public boolean menu_active();
	
/* 정의불가
	* 인스턴스변수 : int num;
	* 인스턴스메서드 : void sum(){}
*/

/* 사용가능
 	 *  변수가 아닌 상수는 가능
		final int count = 20;
	 *  클래스 변수 가능
		static int day = 10;
	 *  추상메서드 형태 가능
		public abstract void sum();
	 *  클래스메서드 가능
		static void addd() {}
*/
}

/* 
 * 인터페이스 : 추상클래스의 하나
 * 추상클래스는 추상메서드를 가지고 있는 클래스이다
 * 추상클래스는 객체 생성에 제한이 있다.
 * 고로 인터페이스는 추상메서드를 가지며, 객체 생성에 제한이 있다.
 * 인터페이스에 정의하는 메서드는 기본적으로 추상메서드로 정의된다.
 * 인터페이스에는 인스턴스변수, 인스턴스메서드 정의불가 
 * 인터페이스에 추상메서드 정의는 abstarct 생략할 수 있다,.
 * 인터페이스에 추상메서드가 하나만 있다면 해당 인터페이스를 '함수형 인터페이스'라고 한다.
 * 함수형 인터페이스는 람다(객체형이면서 함수형인 식 - 아직 개발중이라서 잘 사용하진 않음) 생성할 때 사용할 수 있는 인터페이스이다.
 */
