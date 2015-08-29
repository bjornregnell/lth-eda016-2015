import java.util.Scanner;

public class HighScore {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Hur många poäng fick du?");
	    int points =  scan.nextInt();
		System.out.println("Vad var higscore före senaste spelet?");
		int highscore = scan.nextInt();
		if (points > highscore) {
		    System.out.println("GRATTIS!");
		} else {
		    System.out.println("Försök igen!");
		}
    }
}
