package templateMethod_pattern.after_2;

import templateMethod_pattern.after_2.AttactStrategy;
import templateMethod_pattern.after_2.MoveStrategy;

public abstract class Military {
	
	private String name;									// �����̸�
	private AttactStrategy attactStrategy;
	private MoveStrategy moveStrategy;
	private ItemStrategy itemStrategy;
	
	// �ɸ��ͺ� �ڱ�Ұ� - ���ø� �޼���
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
	
	// �߻�Ŭ���� 
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
	
	// hook �޼���
	public void condition() {
		System.out.println("������ �ʾ�!!");
	}
	
}
