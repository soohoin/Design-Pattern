package templateMethod_pattern.before;

public class AirForce {

	private String name;
	
	public AirForce(String name) {
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
		System.out.println("Condition : ȯ����");
	}
	
	void kind() {
		System.out.println("����");
	}
	
	void attact() {
		System.out.println("�ϴð���");
	}

	void move() {
		System.out.println("�������̵�");
	}

	void item() {
		System.out.println("BVRAAM �̻���");
	}
	
}
