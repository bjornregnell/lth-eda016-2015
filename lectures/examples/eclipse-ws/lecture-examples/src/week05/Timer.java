package week05;

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
	
	public void showMillisAndReset(){
		System.out.println("Timed: less than " + (elapsedMillis() + 1) + " ms");
		reset();
	}

}
