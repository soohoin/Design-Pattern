package strategy_pattern.after;

public class MoveWalk implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("걸어서 이동");
	}

}
