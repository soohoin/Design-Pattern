package strategy_pattern.after;

public abstract class Military {
	
	private String name;										// 군인이름
	private AttactStrategy attactStrategy;        // 공격전략
	private MoveStrategy moveStrategy;			// 이동전략
	
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
