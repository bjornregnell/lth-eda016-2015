package week04;

public class PrecisionProblems {
	public static void main(String[] args) {
		double x = 0.9999999999999999999E6;
		double d = 1E-12;
		System.out.println("x == " + x);
		System.out.println("d == " + d);
		
		// dangerous to check floating point number equality with ==
		boolean isSame = x + d == x;  
		System.out.println("(x + d == x) == " + isSame);
		
		double a = 0.99999999998;
		double b = 0.99999999999;
		
		if (Math.abs(a - b) < 1e-4) {  // a better way to check double equality
			System.out.println("a and b are approximately the same");
			System.out.println("Math.abs(a - b) == " + (Math.abs(a - b)));
		}	
	}
}