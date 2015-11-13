package week11.polymorphism;

public class Cow extends Animal {

    public Cow(int weight) {
        super(weight, "Muuuu!");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("I am a concrete Cow!");
    }
 

}
