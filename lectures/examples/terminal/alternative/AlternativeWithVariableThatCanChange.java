import java.util.Scanner;

public class AlternativeWithVariableThatCanChange {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Skriv heltal: ");
        int x = scan.nextInt();

        if (x == 42) { // OBS! dubbla likhetstecken
            System.out.println("Sant!");
        } else {
            System.out.println("Falskt!");
        }

    }
}