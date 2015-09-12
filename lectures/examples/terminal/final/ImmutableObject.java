class Gurka {  // exempel på oföränderligt objekt (eng. immutable objekt)
    private int vikt;           
    
    void Gurka(int vikt) { 
        this.vikt = vikt;  //endast här tilldelas attributet ett värde        
    }

    public Gurka halva(){    // förändrar inte denna instans, skapa ny istället
        return new Gurka(vikt/2);
    }
    
    public void visa() {
        System.out.println("Denna gurk-instans väger för alltid " + vikt + " gram");
    }
}

public class ImmutableObject {
    public static void main(String[] args){
        Gurka g1 = new Gurka(42);  
        Gurka g2 = g1;              // g1 och g2 refererar till samma objekt
        g1 = g1.halva();            // förändringen av g1 påverkar inte g2
        g1.visa();  
        g2.visa();   
    }
}

