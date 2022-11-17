package house;

public class computer extends house_item{
	public String vga;
	public computer() {}
	public computer(String brand, int price, String vga) {
		super(brand, price); // super : super는 부모이다.
		this.vga=vga;
	}
	public void buy() {
		System.out.println("컴퓨터 구매하였습니다.");
	}
}


/*
package house;

public class computer extends house_item{
	public computer() {}
	public computer(String brand, int price) {
		super(brand, price); // super : super는 부모이다.
		// 생성자도 메서드이기 때문에 상속관계를 형성했다고 하더라도
		// 부모객체의 생성자를 쓰기 위해서는 부모객체의 이름을 써야한다.
		// 그렇기 때문에 부모객체의 메서드를 사용하기 위해
		// 자식객체의 생성자 메서드에 부모객체의 변수를 사용하기 위해서 super를 사용하는 것이다.
	}

}
 
*/
