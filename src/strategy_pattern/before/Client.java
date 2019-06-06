package strategy_pattern.before;

public class Client {
	public static void main(String[] args) {
		Millitary army = new Army("홍길동");
		Millitary airForoce = new AirForce("김동수");
		
		System.out.println("나는 육군의 " + army.getName()+ " 이다.");
		army.attact();
		army.move();
		
		System.out.println("나는 육군의 " + airForoce.getName()+ " 이다.");
		airForoce.attact();
		airForoce.move();
	}
}
