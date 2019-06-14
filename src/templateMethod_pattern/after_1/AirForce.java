package templateMethod_pattern.after_1;

public class AirForce extends Military{

	public AirForce(String name) {
		super(name);
	}

	void kind() {
		System.out.println("공군");
	}
	
	void attact() {
		System.out.println("하늘공격");
	}

	void move() {
		System.out.println("비행기로이동");
	}

	void item() {
		System.out.println("BVRAAM 미사일");
	}

	@Override
	public void condition() {
		System.out.println("최악");
	}
	
	
	
}
