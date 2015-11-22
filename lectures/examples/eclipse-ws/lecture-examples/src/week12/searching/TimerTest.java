package week12.searching;

public class TimerTest {

	public static void main(String[] args) {
		Timer t = new Timer();
		for (int i = 0; i < 5000; i++){
			System.out.print(".");
			if (i % 100 == 0) {
				System.out.print("\n" + i);
			}
		}
		System.out.println("\nDet tog: " + t.elapsedNanos() + " ns");
		System.out.println("\nDet tog: " + t.elapsedMillis() + " ms");
		t.showNanosAndReset("showNanosAndReset");
        t.showMillisAndReset("showMillisAndReset");
	}

}
