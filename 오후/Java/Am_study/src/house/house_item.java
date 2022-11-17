package house;

public abstract class house_item {
	// abstract = 추상; 
	// 추상클래스는 객체 생성이 불가능하다.
	public String brand;
	public int price;

	public house_item() { // 생성자 메서드, 메서드의 실행은 반드시 메서드 명으로 실행이 되어야 한다.
	
	}
	
	public house_item(String brand, int price) {
		this.brand=brand;
		this.price=price; // this는 현재 생성되는 객체이다.
	}
	
	@Override
	public String toString() {
		return "브랜드 : " + brand + " 금액 : " + price;
	}
	//toString은 따로 설정 안해도 자식클래스에서 사용가능(상속되니까!)
	
	public abstract void buy(); 
	// 추상메서드 - 중괄호 없이(내용 없이) 껍데기만 있는것.
	// 부모클래스에는 메서드의 껍데기만 있고,
	// 자식클래스에서 각기 다른 내용으로 재해석해서 사용하는 것
	// 추상메서드를 가진 클래스는 반드시 추상클래스가 되야함!
}



/*
package house;

public class house_item {
	public boolean onoff;
	public String brand;
	public int price;

	public house_item() { // 생성자 메서드, 메서드의 실행은 반드시 메서드 명으로 실행이 되어야 한다.
		onoff =false;
	}
	
	public house_item(String brand, int price) {
		this.brand=brand;
		this.price=price; // this는 현재 생성되는 객체이다.
	}
	
	@Override
	public String toString() {
		return "브랜드 : " + brand + " 금액 : " + price;
	}
	//toString은 따로 설정 안해도 자식클래스에서 사용가능(상속되니까!)
	
	public void power() {
		onoff = !onoff;// false의 부정 => true
		if(onoff)System.out.println("전원 on");
		else System.out.println("전원 off");
	}
	
}
 */
 
