public class CucumberTest {
    public static void main(String[] args){
        Cucumber c = new Cucumber(42);
        c.show();
        c.eat(40);
        c.show();
        c.eat(-40);  // this reveals another bug?!
        c.show();
        c.eat(40);
        c.show();
        Cucumber c2 = new Cucumber(-42);  // testing negative startWeight
        c2.show();  
    }    
}