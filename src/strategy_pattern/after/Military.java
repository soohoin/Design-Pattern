package strategy_pattern.after;

public abstract class Military {
	
	private String name;										// �����̸�
	private AttactStrategy attactStrategy;        // ��������
	private MoveStrategy moveStrategy;			// �̵�����
	
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
	
	public void  setAttact(AttactStrategy attactStrategy) {
		this.attactStrategy = attactStrategy;
	}
	public void setMove(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}		
}
