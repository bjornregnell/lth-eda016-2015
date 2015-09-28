package week05;

public class Complex {
    private double re; // realdel
    private double im; // imaginärdel
    
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    public String toString() {
        return "Complex(" + re + ", " + im + ")";
    }
}
