package week06;

public class FibonacciArray {
	private long[] fib;   //array with Fibonacci numbers 
	private int computed; //number of Fibonacci numbers computed so far
	
	public FibonacciArray(int n) {
		fib = new long[n];
		fib[0] = 1;
		fib[1] = 1;
		computed = 2;
	}
	
	private void compute(int n){
		for(int i = computed; i < n; i++){
			fib[i] = fib[i-2] + fib[i -1];
		}
	}
	
	/** Return Fibonnaci-number i, counting from one */
	public long get(int i){
		if (i >= computed && i <= fib.length) {
			compute(i);
		}
		return fib[i-1];
	}
	
	public void show(){
		for (int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
		System.out.println();
	}
}