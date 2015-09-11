class Gurka {
    public int vikt = 100; //gram 
}

public class ReferenceVariables {
    public static void main(String[] args){
        Gurka g1 = new Gurka();
        Gurka g2 = new Gurka();
        g2.vikt = 200;
        System.out.println("Gurka 1 väger: " + g1.vikt + "g");
        System.out.println("Gurka 2 väger: " + g2.vikt + "g");
        g1.vikt = 200;
        System.out.println("Gurka 1 väger nu: " + g1.vikt + "g");
        if (g1 == g2) {
          System.out.println("samma");
        } else { // g1 och g2 refererar till OLIKA objekt!
          System.out.println("olika");  
        }
    }
}