package cafe.VO;

public class order_list {
	private int seq;
	private String food_name;
	private String an_order;
	private int price;
	private int delicery_complete;
	private String memo;
	
	public order_list() {}
	
	public order_list(String name, String an_order, int price,String memo) {
		super();
		this.food_name = name;
		this.an_order = an_order;
		this.price = price;
		this.memo = memo;
	}
	
	public order_list(int seq, String name, String an_order, int price, int complete, String memo) {
		super();
		this.seq = seq;
		this.food_name = name;
		this.an_order = an_order;
		this.price = price;
		this.delicery_complete = complete;
		this.memo = memo;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getAn_order() {
		return an_order;
	}

	public void setAn_order(String an_order) {
		this.an_order = an_order;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDelicery_complete() {
		return delicery_complete;
	}

	public void setDelicery_complete(int delicery_complete) {
		this.delicery_complete = delicery_complete;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
