package templateMethod_pattern.after_1;

public class Army  extends Military{

	public Army(String name) {
		super(name);
	}
	
	@Override
	void kind() {
		System.out.println("����");
	}
	
	@Override
	void attact() {
		System.out.println("�������");
	}

	@Override
	void move() {
		System.out.println("�ɾ�̵�");
	}

	@Override
	void item() {
		System.out.println("M16  ����");
	}
	
}
