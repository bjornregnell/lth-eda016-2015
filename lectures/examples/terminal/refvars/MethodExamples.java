class Gurka {
    public int vikt = 100;  //gram 
    
    public void halvera(){  //procedur
        vikt = vikt / 2;
    }

    public double kilo(){   //funktion utan sidoeffekt
        return vikt / 1000.0;
    }

    public void visa(){   //procedur
        System.out.println("Gurkan väger " + kilo() + "kg");
    }

}

public class MethodsExamples {
    public static void main(String[] args){
        Gurka g = new Gurka(); g.visa();
        g.vikt = 256;          g.visa();
        g.halvera();           g.visa();
    }
}