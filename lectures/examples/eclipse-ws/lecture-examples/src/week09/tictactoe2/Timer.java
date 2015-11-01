package week09.tictactoe2;

public class Timer {
	private long timestamp; 
	private boolean isPaused;
	private long collectedNanos;
	
	public Timer(){
		reset();
	}
	
	public void reset(){
		isPaused = true;
		collectedNanos = 0L;
	}
	
	public void pause(){
		if (!isPaused) {
			long newTimestamp = System.nanoTime();
			collectedNanos += newTimestamp - timestamp;
			timestamp = newTimestamp;
			isPaused = true;
		} 
	}
	
	public void start(){
		if (isPaused) {
			timestamp = System.nanoTime();
			isPaused = false;
		}
	}
	
	public boolean isPaused(){
		return isPaused;
	}
	
	public double elapsedSeconds(){
		if (isPaused) {
			return collectedNanos/1e9;
		} else {
			return (collectedNanos + System.nanoTime() - timestamp)/1e9;
		}
	}
	
}
