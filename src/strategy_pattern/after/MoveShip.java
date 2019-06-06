package strategy_pattern.after;

public class MoveShip implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("배로이동");
	}
	
}
