package templateMethod_pattern.after_2;

public class AirForce extends Military{

	public AirForce(String name) {
		super(name);
	}

	@Override
	void kind() {
		System.out.println("ÇØ±º");
	}
	
}
