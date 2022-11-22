package cafe.control;

public class exit implements menu_able{

	@Override
	public boolean menu_active() {
		System.out.println("잘가");
		return false;
	}

}
