package week11.polymorphism;

public abstract class Animal extends Food {
    private String sound;

    public Animal(int weight, String sound) {
        super(weight);
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("I am abstract Animal!");
    }
}
