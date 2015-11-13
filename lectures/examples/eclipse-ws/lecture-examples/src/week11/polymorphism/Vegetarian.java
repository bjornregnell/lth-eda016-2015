package week11.polymorphism;

public abstract class Vegetarian extends Food {

    public Vegetarian(int weight) {
        super(weight);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("I am abstract Vegetarian!");
    }
}
