package strategy_pattern.before;

public abstract class Military {
	
	private String name;						//  군인이름
	
	public Military(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;		
	}	
	
	abstract void attact();
	abstract void move();
	
}
