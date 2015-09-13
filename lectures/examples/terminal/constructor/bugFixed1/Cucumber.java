public class Cucumber {
    private int weight;  

    public Cucumber(int startWeight){  // a constructor
        if (startWeight > 0) { 
            weight = startWeight;
        } else {
            weight = 0;  
        }
    }
    
    public int getWeight() {
        return weight;
    }

    public void eat(int bite){
        if (bite <= weight) { 
            weight = weight - bite;
            System.out.println("Eating " + bite + " grams");
        } else {
            weight = 0;
            System.out.println("Ate the last bit!");
        }
    }

    public void show(){
        System.out.println("Cucumber(" + weight + ")");
    }
}