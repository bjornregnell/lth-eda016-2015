public class Cucumber {
    private int weight;  

    public Cucumber(int wieght){  
        if (weight > 0) { 
            this.weight = weight;
        } else {
            this.weight = 0;  
        }
    }
    
    public int getWeight() {
        return weight;
    }

    public void eat(int bite){
        if (bite < 0) {
            System.out.println("Cannot take negative bite; weight unchanged.");
            return;
        } else if (bite <= weight) { 
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

// Can you see the nasty bug? Will the compiler help? 
// Try to explain exactly what happens because of the misspelled parameter.
// What value will the attribute be initialized to?