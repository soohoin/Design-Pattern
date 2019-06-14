package templateMethod_pattern.after_1;

public abstract class Military {
	
	private String name;						//  군인이름
	
	// 케릭터별 자기소개 - 템플릿 메서드
	public void intro() {
		kind();
		System.out.println("Name : "+ name);
		System.out.print("Attact : ");
		attact();
		System.out.print("Move : ");
		move();
		System.out.print("Item : ");
		item();
		System.out.print("Condition : ");
		condition();
	}
	
	public Military(String name) {
		this.name = name;
	}
	public String getName() {
		return name;		
	}
	
	// 추상클레스 
	abstract void kind();
	abstract void attact();
	abstract void move();
	abstract void item();
	
	// hook 메서드
	public void condition() {
		System.out.println("나쁘지 않아!!");
	}
	
}
