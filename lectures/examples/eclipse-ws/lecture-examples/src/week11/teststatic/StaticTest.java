package week11.teststatic;

class CountNew {
	private int numberOfInstatiations;  // should be static

	public CountNew() {
		numberOfInstatiations++;
	}

	public void show() {
		System.out.println(numberOfInstatiations);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		CountNew c = null;
		for (int i = 0; i < 10; i++) {
			c = new CountNew();
			c.show();
		}
	}

}
