package templateMethod_pattern.before;

public class Navy {
	
	private String name;
	
	public Navy(String name) {
		this.name = name;
	}

	public void intro() {
		kind();
		System.out.println("Name : "+name);
		System.out.print("Attact : ");
		attact();
		System.out.print("Move : ");
		move();
		System.out.print("Item : ");
		item();
		System.out.println("Condition : ����");
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

	
}
