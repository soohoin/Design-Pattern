package strategy_pattern.before;

public class Client {
	public static void main(String[] args) {
		Millitary army = new Army("홍길동");
		Millitary airForoce = new AirForce("김동수");
		
		System.out.println("나는 육군 " + army.getName()+ " 이다.");
		System.out.print("attact() : ");
		army.attact();
		System.out.print("move() : ");
		army.move();
		
		System.out.println("나는 공군 " + airForoce.getName()+ " 이다.");
		System.out.print("attact() : ");
		airForoce.attact();
		System.out.print("move() : ");
		airForoce.move();
	}
}
