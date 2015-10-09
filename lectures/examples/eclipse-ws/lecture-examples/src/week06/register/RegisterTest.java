package week07.register;

import java.util.Scanner;

public class RegisterTest {
	public static void main(String[] args) {
		System.out.print("Hur många studenter? ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Test test = new Test(n);
		for (int i = 0; i < n; i++) {
			test.add(new Student());
		}
		
		//test.printStatistics();
		
		test.printStatistics2();
		scan.close();
	}
}