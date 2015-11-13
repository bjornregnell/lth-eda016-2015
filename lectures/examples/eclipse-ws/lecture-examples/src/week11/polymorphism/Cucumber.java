package week11.polymorphism;

public class Cucumber extends Vegetarian {

    public Cucumber(int weight) {
        super(weight);
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("I am a concrete Cucumber!");
    }
}
