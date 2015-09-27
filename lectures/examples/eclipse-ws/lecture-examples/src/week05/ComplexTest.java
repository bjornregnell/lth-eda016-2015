package week05;

public class ComplexTest {

	public static void main(String[] args) {
		Complex z = new Complex(1.5, 2.3);
		System.out.println("z = " + z.toString());
		System.out.println("z = " + z);  //z.toString() is called implicitly
	}

}
