/**
*    En klass som beskriver en Gurka som kan ätas bit för bit.
*/
public class Cucumber {
    private int weight;  

    /** Skapar en gurka som väger startWeight gram. 
    *   Om startWeight är negativt blir gurkans vikt 0.  
    */
    public Cucumber(int weight){  
        if (weight > 0) { 
            this.weight = weight;
        } else {
            this.weight = 0;  
        }
    }
    
    /** Returnerar gurkans vikt i gram */    
    public int getWeight() {
        return weight;
    }

    /** Minskar gurkans vikt med bite gram. 
    *   Om bite är större än vikten blir gurkans vikt 0. 
    *   Om bit är negativt ändras vikten inte 
    */
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

    /** Skriver ut gurkans vikt */
    public void show(){
        System.out.println("Cucumber(" + weight + ")");
    }
}
