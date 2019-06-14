package templateMethod_pattern.after_1;

public class Client {
	public static void main(String[] args) {
		Army army = new Army("È«±æµ¿");
		AirForce airForoce = new AirForce("±èµ¿¼ö");
		Navy navy = new Navy("°í°æ½Ä");
		
		army.intro();
		airForoce.intro();
		navy.intro();
		
	}
}
