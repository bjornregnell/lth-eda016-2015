package week07.equals;

public class TestEqualsPoint {
	public static void equalityTest(Point a, Point b){
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
		Point p1 = new Point(100, 100);
		Point p2 = new Point(100, 100);
		Point p3 = new Point(200, 100);
		Point p4 = null;
		equalityTest(p1,p2); 
		equalityTest(p1,p3); 
		equalityTest(p1,p4);
		// equalityTest(p4,p4);  // run time error: NullPointerException
	}
}