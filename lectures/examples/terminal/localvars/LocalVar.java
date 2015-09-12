class Gurka {
    public int vikt = 100;
    
    public void visaLokalVariabel(){
        int vikt = 0;  //ny lokal variabel med ett namn som överskuggar attributets namn
        System.out.println("Lokal variabel vikt: " + vikt);
        System.out.println("Attributet vikt: " + this.vikt);
    }
    
    public void visaVikt(){
        System.out.println("Attributet vikt: " + vikt);
    }
}

public class LocalVar {
    public static void main(String[] args){
        int vikt = 42;  //lokal variabel i metoden main
        Gurka g = new Gurka();
        g.visaLokalVariabel();
        g.visaVikt();
        System.out.println("Lokal vikt i main: " + vikt);
    }
}