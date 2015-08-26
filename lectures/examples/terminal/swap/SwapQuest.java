import java.util.Scanner;  

public class SwapQuest {
    public static void main(String[] args){
    	//Steg 1: skapa en Scanner
		Scanner scan = new Scanner(System.in); 

        int x = scan.nextInt();  //Steg 2: läs in x
        int y = scan.nextInt();  //Steg 3: läs in y

        //Steg 4: Skriv ut x och y
        System.out.println("x: " + x + "  y: " + y);

        //Steg 5: byt plats på värdena mellan x och y  HUR???
        // ... skriv SWAP-satser här ...
        //Steg 6: Skriv ut x och y
        System.out.println("x: " + x + "  y: " + y);
    }
}