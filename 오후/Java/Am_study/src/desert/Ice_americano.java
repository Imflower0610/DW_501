package desert;
//아이스아메리카노는 얼음이 있다
public class Ice_americano {
	public int price;
	public String name;

	public Ice_americano() {}
	
	public Ice_americano(String name, int price) {
		this.name =name;
		this.price=price; // this는 현재 생성되는 객체이다.
	}
	
	public String toString() {
		return "원두명 : " + name + " 금액 : " + price;
	}
}
