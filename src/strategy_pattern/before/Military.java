package strategy_pattern.before;

public abstract class Military {
	
	private String name;						//  �����̸�
	
	public Military(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;		
	}	
	
	abstract void attact();
	abstract void move();
	
}
