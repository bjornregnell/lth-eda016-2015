package week05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;    
		int i;
		do {  // do-while görs alltid minst en gång
			System.out.println("Ange heltal större än 42: ");
			i = scan.nextInt();
			n++;
		} while (i < 42);
		System.out.println("Du använde " + n + " försök innan du lyckades.");
	}
}
