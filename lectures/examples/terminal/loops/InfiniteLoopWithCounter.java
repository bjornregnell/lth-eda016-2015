public class InfiniteLoopWithCounter {

    public static void main(String[] args){

    	int i = 0;
    	while (true) {
    		System.out.println("Hej " + i);
    		i = i + 1;
    	}

    }
}