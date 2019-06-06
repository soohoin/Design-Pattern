package strategy_pattern.after;

public class Client {
	public static void main(String[] args) {
		Military army = new Army("ȫ�浿");
		army.setAttact(new  AttactTheGround());
		army.setMove(new MoveWalk());
		
		Military airForce = new AirForce("�赿��");
		airForce.setAttact(new AttactTheGround());
		airForce.setMove(new MoveAirplane());
		
		Military navy = new Navy("����");
		navy.setAttact(new AttactTheSky());
		navy.setMove(new MoveShip());
		
		
		
		
		
		System.out.println("���� ���� " + army.getName()+ " �̴�.");
		System.out.print("attact() : ");
		army.attact();
		System.out.print("move() : ");
		army.move();
		System.out.println();
		
		System.out.println("���� ���� " + airForce.getName()+ " �̴�.");
		System.out.print("attact() : ");
		airForce.attact();
		System.out.print("move() : ");
		airForce.move();
		System.out.println();
		
		System.out.println("���� �ر� " + navy.getName()+ " �̴�.");
		System.out.print("attact() : ");
		navy.attact();
		System.out.print("move() : ");
		navy.move();
	}
}
