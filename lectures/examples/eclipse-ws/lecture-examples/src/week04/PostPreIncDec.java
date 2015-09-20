package week04;

public class PostPreIncDec {

	public static void main(String[] args) {
		int a = 10;
		int x = a++;  
		System.out.println("a == " + a + "   x == " + x);
		int b = 10;
		int y = ++b; 
		System.out.println("b == " + b + "   y == " + y);
		y = --b; 
		System.out.println("b == " + b + "   y == " + y);
		y = b--; 
		System.out.println("b == " + b + "   y == " + y);
		y += 1;
		System.out.println("b == " + b + "   y == " + y);
	}

}
