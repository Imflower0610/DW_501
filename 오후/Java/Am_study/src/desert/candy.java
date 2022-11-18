package desert;
// 츄파춥스는 사탕이다.
public class candy {
	public int price;
	public String name;

	public candy() {}
	
	public candy(String name, int price) {
		this.name =name;
		this.price=price; // this는 현재 생성되는 객체이다.
	}
	
	public String toString() {
		return " 맛 : " + name + " 금액 : " + price;
	}
}
