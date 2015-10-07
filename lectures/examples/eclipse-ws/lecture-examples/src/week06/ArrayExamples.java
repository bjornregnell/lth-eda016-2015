package week06;

public class ArrayExamples {
	// https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html
	public static void main(String[] args) {
		
		int[] nbrs = new int[10];
		for (int i = 0; i < nbrs.length; i++) {
		    nbrs[i] = 42;
		}
		System.out.println(nbrs);
		System.out.println(nbrs[0]);
		
		// Array initializer: use curly braces
		int[] fibFirstTen = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
		System.out.println(fibFirstTen.length);
		//System.out.println(fibFirstTen[10]); //ArrayIndexOutOfBoundsException: 10
				
		int n = 50;
		int[] fib = new int[n];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
		    fib[i] = fib[i - 1] + fib[i - 2];
		}
		
		System.out.println("Fibonacci: first " + n + " numbers");
		for (int i = 0; i < fib.length; i++) {
			System.out.println("[" + i + "]:" + fib[i] + " ");
			
		} 
	}
}
