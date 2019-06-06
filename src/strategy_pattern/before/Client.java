package strategy_pattern.before;

public class Client {
	public static void main(String[] args) {
		Millitary army = new Army("ȫ�浿");
		Millitary airForoce = new AirForce("�赿��");
		
		System.out.println("���� ���� " + army.getName()+ " �̴�.");
		System.out.print("attact() : ");
		army.attact();
		System.out.print("move() : ");
		army.move();
		
		System.out.println("���� ���� " + airForoce.getName()+ " �̴�.");
		System.out.print("attact() : ");
		airForoce.attact();
		System.out.print("move() : ");
		airForoce.move();
	}
}
