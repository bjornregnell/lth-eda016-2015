package week13.hanoi;

import java.util.Scanner;

public class TowersOfHanoi {
    public static void main(String[] args) {
        System.out.print("Antal brickor: ");
        Scanner scan = new Scanner(System.in);
        int nbrDisks = scan.nextInt();
        scan.close();
        
        HanoiBoard board = new HanoiBoard(nbrDisks);
        HanoiStrategy strategy = new HanoiStrategy(board);
        strategy.moveDisks();
    }
}
