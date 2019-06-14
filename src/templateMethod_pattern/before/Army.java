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
		System.out.println("Condition : 최악");
	}	

	void kind() {
		System.out.println("육군");
	}
	
	void attact() {
		System.out.println("지상공격");
	}

	void move() {
		System.out.println("걸어서이동");
	}

	void item() {
		System.out.println("M16  소총");
	}
	
}
