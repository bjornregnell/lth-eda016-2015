package temp;

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		System.out.println("c1: " + c1);
		Complex c2 = new Complex(3,4);
		System.out.println("c2: " + c2);
		Complex c3 = new Complex(1,2);
		System.out.println("c3: " + c3);
		Complex c4 = new Complex(3,4);
		System.out.println("c4: " + c4);
		
		System.out.println("\n *** c1.mul1(c2)");
		c1.mul1(c2);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		
		System.out.println("\n *** c3.mul2(c4)");
		c3.mul2(c4);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);		
	}

}
