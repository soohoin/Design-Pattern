package templateMethod_pattern.after_1;

public class AirForce extends Military{

	public AirForce(String name) {
		super(name);
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

	@Override
	public void condition() {
		System.out.println("�־�");
	}
	
	
	
}
