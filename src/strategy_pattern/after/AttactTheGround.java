package strategy_pattern.after;

public class AttactTheGround implements AttactStrategy{

	@Override
	public void attact() {
		System.out.println("지상공격");
	}

}
