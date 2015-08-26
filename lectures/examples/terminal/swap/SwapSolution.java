import java.util.Scanner;  

public class SwapSolution {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in); 

        int x = scan.nextInt();  
        int y = scan.nextInt();  

        System.out.println("x: " + x + "  y: " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + "  y: " + y);
    }
}