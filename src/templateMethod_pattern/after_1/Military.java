package templateMethod_pattern.after_1;

public abstract class Military {
	
	private String name;						//  �����̸�
	
	// �ɸ��ͺ� �ڱ�Ұ� - ���ø� �޼���
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
	
	// �߻�Ŭ���� 
	abstract void kind();
	abstract void attact();
	abstract void move();
	abstract void item();
	
	// hook �޼���
	public void condition() {
		System.out.println("������ �ʾ�!!");
	}
	
}
