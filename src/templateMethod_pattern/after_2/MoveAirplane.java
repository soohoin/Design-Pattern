package templateMethod_pattern.after_2;

public class MoveAirplane implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("비행기로 이동");
	}

	
}
