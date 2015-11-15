package week11.testfinal;

public class MyInteger {  // should be final
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }
    
    public int intValue() {
        return value;
    }
}
