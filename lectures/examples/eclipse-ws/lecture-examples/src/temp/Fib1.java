package temp;

public class Fib1 {
	
	public static int fib(int n) {
		int prev = 1;
		int next = 1;
		for (int i = 3; i <= n; i++){
			int oldNext = next;
			next = prev + next;
			prev = oldNext;
		}
		return next;
	}
	
	public static int fibRecursive(int n) {
		if (n == 1) return 1;
		if (n == 2) return 1;
		return fibRecursive(n-1) + fibRecursive(n-2);
		
	}

	public static void main(String[] args) {
		System.out.println(fib(5));
	}

}
