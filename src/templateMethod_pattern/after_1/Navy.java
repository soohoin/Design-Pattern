package templateMethod_pattern.after_1;

public class Navy extends Military{
	
	
	public Navy(String name) {
		super(name);
	}

	void kind() {
		System.out.println("�ر�");
	}
	
	void attact() {
		System.out.println("�������");
	}

	void move() {
		System.out.println("����̵�");
	}

	void item() {
		System.out.println("SLBM ź������ź");
	}

	@Override
	public void condition() {
		System.out.println("�ֻ�");
	}
	
}
