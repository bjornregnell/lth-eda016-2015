package week07.equals;

public class TestEqualsRobot {
	public static void equalityTest(Object a, Object b){
		System.out.println("*** Testing equality of " + a + " and " + b);
		if (a == b) {
			System.out.println("    Reference equality: same");
		} else {
			System.out.println("    Reference inequality: different");
		}
		if (a.equals(b)){
			System.out.println("    Structural equality: same contents");
		} else {
			System.out.println("    Structural inequality: different contents");
		}
	}

	public static void main(String[] args) {
		Robot r1 = new Robot("Wall*E");
		Robot r2 = new TalkingRobot("Marvin", "I am very depressed.");
		Robot r3 = new TalkingRobot("Marvin", "I am very depressed.");
		Point p1 = new Point(100, 100);
		equalityTest(r1,r1); 
		equalityTest(r1,r2); 
		equalityTest(r2,r3); 
		equalityTest(r1,p1);
	}
} 
//