package templateMethod_pattern.after_2;

import templateMethod_pattern.after_2.AttactStrategy;
import templateMethod_pattern.after_2.MoveStrategy;

public abstract class Military {
	
	private String name;									// 군인이름
	private AttactStrategy attactStrategy;
	private MoveStrategy moveStrategy;
	private ItemStrategy itemStrategy;
	
	// 케릭터별 자기소개 - 템플릿 메서드
	protected void intro() {
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
	
	public void attact() {
		attactStrategy.attact();
	}
	public void move() {
		moveStrategy.move();
	}
	public void item() {
		itemStrategy.item();
	}
	
	// 추상클레스 
	abstract void kind();
	
	public void setItem(ItemStrategy itemStrategy) {
		this.itemStrategy = itemStrategy;
	}	
	public void  setAttact(AttactStrategy attactStrategy) {
		this.attactStrategy = attactStrategy;
	}
	public void setMove(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}
	
	// hook 메서드
	public void condition() {
		System.out.println("나쁘지 않아!!");
	}
	
}
