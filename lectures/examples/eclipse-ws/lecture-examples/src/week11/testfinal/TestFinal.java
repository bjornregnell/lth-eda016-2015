package week11.testfinal;

class ManiuplatedInt extends MyInteger {
    private int myInt = 0;
    
    public ManiuplatedInt(int value) {
        super(42);
        this.myInt = value;
    }
    
    public int intValue() {
        return myInt  + 42;
    }    
}

class ManipulatedChessAlgorithm extends ChessAlgorithm {
    @Override
    int getFirstPlayer() {  
        return BLACK; // this is against the rules of chess
    }
}

public class TestFinal {

    public static void main(String[] args) {
        MyInteger i = new ManiuplatedInt(0);
        System.out.println(i.intValue());
        System.out.println(new ManipulatedChessAlgorithm().getFirstPlayer());
    }

}
