package week11.polymorphism;

public class Tomato extends Vegetarian {

    public Tomato(int weight) {
        super(weight);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("I am a concrete Tomato!");
    }
}
