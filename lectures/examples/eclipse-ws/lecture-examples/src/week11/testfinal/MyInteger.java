package week11.testfinal;

public class MyInteger {  // class should be final
    private int value; // attribute should be final

    public MyInteger(int value) {
        this.value = value;
    }
    
    public int intValue() {
        return value;
    }
}
