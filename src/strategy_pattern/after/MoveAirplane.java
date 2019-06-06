package strategy_pattern.after;

public class MoveAirplane implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("비행기로 이동");
	}

	
}
