class Gurka {
    private int vikt;           // attribut 
    
    void Gurka(int initVikt) {  // konstruktor med parameter
        vikt = initVikt;        // ge attributet ett värde vid new
    }

    public final static String latinsktNamn = "Cucumis sativus";  
    
    public Gurka halvera(){    // förändrar inte denna, skapar ny istället
        return new Gurka(vikt/2);
    }
    
    public String toString() {
        return "Denna gurka (" + latinsktNamn + ") väger " + vikt + "g";
    }
}

public class ImmutableObject {
    public static void main(String[] args){
        Gurka g = new Gurka(200);  // skapa Gurka med argumentet 200
        g.vikt = 200;              // ERROR: ger kompileringsfel! vilket?  
        g.latinsktNamn = "Tomat";  // ERROR: ger kompileringsfel! Vilket?
        System.out.println(g);   
    }
}

