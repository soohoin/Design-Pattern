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
		System.out.println("Condition : 환상적");
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
	
}
