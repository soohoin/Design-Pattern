package strategy_pattern.before;

public class AirForce extends Military{

	public AirForce(String name) {
		super(name);
	}

	@Override
	void attact() {
		System.out.println("하늘공격");
	}

	@Override
	void move() {
		System.out.println("비행기로이동");
	}
	
}
