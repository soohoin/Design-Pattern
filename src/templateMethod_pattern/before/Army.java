package templateMethod_pattern.before;

public class Army  {

	private String name;
	
	public Army(String name) {
		this.name  = name;
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
		System.out.println("Condition : �־�");
	}	

	void kind() {
		System.out.println("����");
	}
	
	void attact() {
		System.out.println("�������");
	}

	void move() {
		System.out.println("�ɾ�̵�");
	}

	void item() {
		System.out.println("M16  ����");
	}
	
}
