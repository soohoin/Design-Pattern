package strategy_pattern.before;

public class Client {
	public static void main(String[] args) {
		Millitary army = new Army("ȫ�浿");
		Millitary airForoce = new AirForce("�赿��");
		
		System.out.println("���� ������ " + army.getName()+ " �̴�.");
		army.attact();
		army.move();
		
		System.out.println("���� ������ " + airForoce.getName()+ " �̴�.");
		airForoce.attact();
		airForoce.move();
	}
}
