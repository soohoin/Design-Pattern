package templateMethod_pattern.after_1;

public class Army  extends Military{

	public Army(String name) {
		super(name);
	}
	
	@Override
	void kind() {
		System.out.println("육군");
	}
	
	@Override
	void attact() {
		System.out.println("지상공격");
	}

	@Override
	void move() {
		System.out.println("걸어서이동");
	}

	@Override
	void item() {
		System.out.println("M16  소총");
	}
	
}
