package week05;
import java.util.Scanner;

public class BrokenSwitch {
	public static void main(String[] args) {
		System.out.println("Ange första bokstaven i din favoritgrönsak:");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine(); 
		char ch = line.length() > 0 ? line.charAt(0) : ' ';
		switch (ch) {
		case 'g': 
			System.out.println("gurka");
		case 'z': 
			System.out.println("zuccini");
			break;
		case 't': 
			System.out.println("tomat");
		case 'b': 
			System.out.println("brocolli");
		default:
			System.out.println("annan grönsak");
			//break behövs inte i default om sist, men bra ändå vid framtida ändring
		}
	}
}