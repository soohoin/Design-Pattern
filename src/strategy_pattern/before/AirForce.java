package strategy_pattern.before;

public class AirForce extends Military{

	public AirForce(String name) {
		super(name);
	}

	@Override
	void attact() {
		System.out.println("�ϴð���");
	}

	@Override
	void move() {
		System.out.println("�������̵�");
	}
	
}
