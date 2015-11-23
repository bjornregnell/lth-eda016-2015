package week12.sorting;

public class Timer {
	private long timestamp = System.nanoTime();
	
	public void reset(){
		timestamp = System.nanoTime();
	}
	
	public long elapsedNanos(){
		return System.nanoTime() - timestamp;
	}
	
	public int elapsedMillis(){
		return Math.toIntExact(elapsedNanos()/ 1000000L);
	}
	
	public void showMillisAndReset(String msg){
		System.out.println(msg + " Timed: less than " + (elapsedMillis() + 1) + " ms");
		reset();
	}

    public void showNanosAndReset(String msg) {
        System.out.println(msg + " Timed: less than " + (elapsedNanos() + 1) + " ns");
        reset();
    }
	
}
