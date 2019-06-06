package strategy_pattern.before;

public class Army  extends Millitary{

	public Army(String name) {
		super(name);
	}

	@Override
	void attact() {
		System.out.println("지상공격");
	}

	@Override
	void move() {
		System.out.println("지상으로이동");
	}

}
