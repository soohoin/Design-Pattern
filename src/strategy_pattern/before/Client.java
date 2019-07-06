package strategy_pattern.before;

public class Client {
	public static void main(String[] args) {
		
//		ddddddddd
		Military army = new Army("ȫ�浿");
		Military airForoce = new AirForce("�赿��");
		Military navy = new Navy("����");
		
		System.out.println("���� ���� " + army.getName()+ " �̴�.");
		System.out.print("attact() : ");
		army.attact();
		System.out.print("move() : ");
		army.move();
		System.out.println();
		
		System.out.println("���� ���� " + airForoce.getName()+ " �̴�.");
		System.out.print("attact() : ");
		airForoce.attact();
		System.out.print("move() : ");
		airForoce.move();
		System.out.println();
		
		System.out.println("���� �ر� " + navy.getName()+ " �̴�.");
		System.out.print("attact() : ");
		navy.attact();
		System.out.print("move() : ");
		navy.move();
	}
}
