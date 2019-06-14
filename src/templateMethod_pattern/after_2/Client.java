package templateMethod_pattern.after_2;

public class Client {
	public static void main(String[] args) {
		Military army = new Army("È«±æµ¿");
		army.setAttact(new  AttactTheGround());
		army.setMove(new MoveWalk());
		army.setItem(new ItemM16());
		army.intro();
		
		Military airForce = new AirForce("±èµ¿¼ö");
		airForce.setAttact(new AttactTheGround());
		airForce.setMove(new MoveAirplane());
		airForce.setItem(new ItemSLBM());
	    airForce.intro();
		
		Military navy = new Navy("°í°æ½Ä");
		navy.setAttact(new AttactTheSky());
		navy.setMove(new MoveShip());
		navy.setItem(new ItemSLBM());
		navy.intro();
		
	}
}
