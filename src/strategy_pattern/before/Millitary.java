package strategy_pattern.before;

public abstract class Millitary {
	
	private String name;						//  군인이름
	
	public Millitary(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;		
	}	
	
	abstract void attact();
	abstract void move();
	
}
