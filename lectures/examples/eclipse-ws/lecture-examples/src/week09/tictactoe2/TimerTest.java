package week09.tictactoe2;

public class TimerTest {

	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		t.start();             	System.out.println("Elapsed: " + t.elapsedSeconds());
		Thread.sleep(2000);
		t.pause();				System.out.println("Elapsed: " + t.elapsedSeconds());
		Thread.sleep(2000);
		t.start();				System.out.println("Elapsed: " + t.elapsedSeconds());
		Thread.sleep(2000);
		t.pause();				System.out.println("Elapsed: " + t.elapsedSeconds());
		Thread.sleep(2000);
		System.out.println("Elapsed: " + t.elapsedSeconds());
	}

}
