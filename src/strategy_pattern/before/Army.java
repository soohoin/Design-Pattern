package strategy_pattern.before;

public class Army  extends Military{

	public Army(String name) {
		super(name);
	}

	@Override
	void attact() {
		System.out.println("지상공격");
	}

	@Override
	void move() {
		System.out.println("걸어서 이동");
	}

}
