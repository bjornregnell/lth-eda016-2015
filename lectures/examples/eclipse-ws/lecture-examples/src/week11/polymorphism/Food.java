package week11.polymorphism;

public abstract class Food {
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    
    public void show() {
        System.out.println("I am abstract Food!");
    }
}
