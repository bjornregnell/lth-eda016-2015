class Gurka {
    public int vikt = 100; //en variabel i en klass kallas attribut (eller fält/field)
    
    public void halvera(){ //denna metod är en procedur
        vikt = vikt / 2;
    }

    public double kilo(){  //denna metod är en funktion utan sidoeffekt
        return vikt / 1000.0;
    }

    public void visa(){    //denna metod är en procedur
        System.out.println("Gurkan väger " + kilo() + "kg");
    }
}

public class MethodsExamples {
    public static void main(String[] args){
        Gurka g = new Gurka(); 
        g.visa();
        g.vikt = 256;
        g.visa();
        g.halvera();
        g.visa();
    }
}