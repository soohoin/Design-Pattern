package templateMethod_pattern.after_1;

public class Client {
	public static void main(String[] args) {
		Army army = new Army("ȫ�浿");
		AirForce airForoce = new AirForce("�赿��");
		Navy navy = new Navy("����");
		
		army.intro();
		airForoce.intro();
		navy.intro();
		
	}
}
