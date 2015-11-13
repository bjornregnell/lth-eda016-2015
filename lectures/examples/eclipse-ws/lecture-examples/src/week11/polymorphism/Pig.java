package week11.polymorphism;

public class Pig extends Animal {

    public Pig(int weight) {
        super(weight, "Nöff Nöff!");
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("I am a concrete Pig!");
    }
}
