package strategy_pattern.before;

public class Army  extends Millitary{

	public Army(String name) {
		super(name);
	}

	@Override
	void attact() {
		System.out.println("�������");
	}

	@Override
	void move() {
		System.out.println("���������̵�");
	}

}
