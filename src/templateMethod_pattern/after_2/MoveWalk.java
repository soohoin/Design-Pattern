package templateMethod_pattern.after_2;

public class MoveWalk implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("걸어서 이동");
	}

}
