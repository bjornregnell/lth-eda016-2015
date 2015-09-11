class Gurka {
    public int vikt = 100; //gram
    
    public void kapa(int gramAttKapa){ //denna metod är en procedur med parameter
        vikt = vikt - gramAttKapa;
    }
    
    public void visa(){    
        System.out.println("Gurkan väger " + vikt + "g");
    }    
}

public class MethodWithParameter {
    public static void main(String[] args){
        Gurka g = new Gurka(); 
        g.visa();
        g.kapa(75);
        g.visa();
    }
}