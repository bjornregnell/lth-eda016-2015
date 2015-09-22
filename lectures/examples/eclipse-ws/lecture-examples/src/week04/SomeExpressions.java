package week04;

public class SomeExpressions {  
	// follow the assignments of each line in the debugger:
	public static void main(String[] args) {
		int imax = Integer.MAX_VALUE;   
		int i = 100;
		double d = 314.61;
		short s = (short) i; // värdet av i konverteras till short
		short t = (short) imax;  //"övre" bitarna av imax huggs av 
		i = (int) d;         // värdet av d konverteras till int, 314.61 -> 314
		
		int a = 0;
		int b = 12;
		int c = 20;
		a = 2 * (b + c) + 4; // a = 68
		b = a / 10;          // b = 6 (6.8, decimalerna stryks)
		c = a % 10;          // c = 8 (68/10 = 6 + 8/10, 8 är resten)
		
		double x = 1.4;
		double y = 1 + 2 * (x + 1); // y = 5.8
		double z = x * x + y * y;   // z = 35.60
		z = z / 10;                 // z = 3.56
		int r = 5;
		x = 1 + (double) r / 2;     // x = 3.5
	}
}