public class LoopWithTimer {

    public static void main(String[] args){

    	long startTime = System.currentTimeMillis();
    	int i = 0;
    	int max = 5000;
     	while (i < max) {
    		System.out.println("Hej " + i);
    		i = i + 1;
    	}
    	long stopTime = System.currentTimeMillis();
    	long duration = stopTime-startTime;
    	System.out.println(
    		"Det tog " + duration + 
    		" ms att räkna till " + max);
    }
}