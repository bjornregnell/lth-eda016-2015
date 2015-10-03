package week06;

public class FibonacciArrayTest {

	public static void main(String[] args) {
		FibonacciArray fibs = new FibonacciArray(100);
		fibs.show();
		long fib90 = fibs.get(90);
		System.out.println("Fibonacci-number 90: " + fib90); 
		fibs.show();
		long fib100 = fibs.get(100);
		System.out.println("Fibonacci-number 100: " + fib100); 
		fibs.show();
	}

}
