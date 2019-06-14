package templateMethod_pattern.after_2;

public class Army extends Military{

	public Army(String name) {
		super(name);
	}

	@Override
	void kind() {
		System.out.println("À°±º");
	}
	
}
