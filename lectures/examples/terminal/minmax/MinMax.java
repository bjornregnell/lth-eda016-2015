import java.util.Scanner;  

public class MinMax {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        int maxSoFar = Integer.MIN_VALUE; //mindre än alla andra tal
        System.out.println("*** Hitta största talet ***");
        System.out.print("Ange flera heltal separerade med blanktecken.");
        System.out.println(" Avsluta med ENTER följt av Ctrl+D");
        while (scan.hasNextInt()){
            int x = scan.nextInt();
            if (x > maxSoFar) {
                maxSoFar = x;
            }
        }
        if (maxSoFar == Integer.MIN_VALUE) {
            System.out.println("*** ERROR: Hittade inget heltal.");
        } else {
            System.out.println("Största talet är: " + maxSoFar);
        }
    }
    //Övning: gör så att BÅDE största och minsta talet skrivs ut
}