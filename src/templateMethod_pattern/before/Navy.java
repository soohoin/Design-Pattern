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
		System.out.println("Condition : 보통");
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

	
}
