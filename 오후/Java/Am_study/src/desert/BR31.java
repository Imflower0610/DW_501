package desert;
// 상속관계 - 엄마는 외계인은 베라아이스크림이다.
public class BR31 {
	
		public int price;
		public String name;

		public BR31() {}
		
		public BR31(String name, int price) {
			this.name =name;
			this.price=price; // this는 현재 생성되는 객체이다.
		}
		
		public String toString() {
			return "아이스크림 : " + name + " 금액 : " + price;
		}
		
}
