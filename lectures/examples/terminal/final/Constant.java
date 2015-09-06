class Gurka {
    public int vikt = 100; //gram 

    public final String latinsktNamn = "Cucumis sativus";   //*1
    
    public String toString() {
        return "Denna gurka (" + latinsktNamn + ") väger " + vikt + "g";
    }
}

public class Constant {
    public static void main(String[] args){
        Gurka g = new Gurka();
        g.vikt = 200;  
        g.latinsktNamn = "Tomat";  // ERROR: ger kompileringsfel! Vilket?
        System.out.println(g.toString());  // *2 
    }
}

// *1: final brukar även deklareras static; det behövs ju bara en enda
// *2: .toString behövs ej