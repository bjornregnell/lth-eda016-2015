class Cucumber {
    private int weight = 100;  // a private field
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int newWeight){
        if (newWeight > 0) { // prohibit negative weight
            weight = newWeight;
        } else {
            weight = 0;
        }
    }

    public void show(){
        System.out.println("Cucumber(" + weight + ")");
    }
}

public class PrivateAttribute {
    public static void main(String[] args){
        Cucumber c = new Cucumber();
        //c.weight = -42; // COMPILE TIME ERROR (What error msg?)
        c.setWeight(-42);
        c.show();
    }
}