package templateMethod_pattern.after_2;

public class Navy extends Military{

	public Navy(String name) {
		super(name);
	}

	@Override
	void kind() {
		System.out.println("°ø±º");
	}
	
}
