import java.util.Scanner;

public class HighScoreAbstraction {

    public static int points = 0;
    public static int highscore = 0;
    public static Scanner scan = new Scanner(System.in);

    public static void askUser(){
        System.out.println("Hur många poäng fick du?");
        points =  scan.nextInt();
        System.out.println("Vad var higscore före senaste spelet?");
        highscore = scan.nextInt();
    }

    public static void updateHighscore(){
        if (points >= highscore) {
            System.out.println("GRATTIS!");
        } else {
            System.out.println("Försök igen!");
        }        
    }

    public static void main(String[] args){
        askUser();
        updateHighscore();
    }
}
