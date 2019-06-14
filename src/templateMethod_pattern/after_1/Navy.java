package templateMethod_pattern.after_1;

public class Navy extends Military{
	
	
	public Navy(String name) {
		super(name);
	}

	void kind() {
		System.out.println("해군");
	}
	
	void attact() {
		System.out.println("지상공격");
	}

	void move() {
		System.out.println("배로이동");
	}

	void item() {
		System.out.println("SLBM 탄도유도탄");
	}

	@Override
	public void condition() {
		System.out.println("최상");
	}
	
}
