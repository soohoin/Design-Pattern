package strategy_pattern.before;

public class Navy extends Military{

	public Navy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void attact() {
		System.out.println("�������");
	}

	@Override
	void move() {
		System.out.println("����̵�");
	}

	
}
