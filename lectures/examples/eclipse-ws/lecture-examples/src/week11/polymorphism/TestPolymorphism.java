package week11.polymorphism;

import java.util.ArrayList;

public class TestPolymorphism {

    public static void main(String[] args) {
        // Food f = new Food(42);    // compile error; abstract class
        Food f = new Tomato(42);
        ArrayList<Food> foodList = new ArrayList<Food>();
        foodList.add(f);
        foodList.add(new Pig(84));
        foodList.add(new Cow(168));
        foodList.add(new Cucumber(21));
        for (Food f: foodList){
            f.show();
            int weight = f.getWeight();
            // String sound = f.getSound(); // compile error; undefined
            System.out.println("Weight: " + weight);
        }
        Animal[] animalArray = {new Pig(100), new Cow(500), new Pig(100)};
        for (Animal a: animalArray){
            String sound = a.getSound();
            System.out.println(sound);
        }
    }
}
