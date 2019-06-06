package strategy_pattern.after;

public class Client {
	public static void main(String[] args) {
		Military army = new Army("홍길동");
		army.setAttact(new  AttactTheGround());
		army.setMove(new MoveWalk());
		
		Military airForce = new AirForce("김동수");
		airForce.setAttact(new AttactTheGround());
		airForce.setMove(new MoveAirplane());
		
		Military navy = new Navy("고경식");
		navy.setAttact(new AttactTheSky());
		navy.setMove(new MoveShip());
		
		
		
		
		
		System.out.println("나는 육군 " + army.getName()+ " 이다.");
		System.out.print("attact() : ");
		army.attact();
		System.out.print("move() : ");
		army.move();
		System.out.println();
		
		System.out.println("나는 공군 " + airForce.getName()+ " 이다.");
		System.out.print("attact() : ");
		airForce.attact();
		System.out.print("move() : ");
		airForce.move();
		System.out.println();
		
		System.out.println("나는 해군 " + navy.getName()+ " 이다.");
		System.out.print("attact() : ");
		navy.attact();
		System.out.print("move() : ");
		navy.move();
	}
}
