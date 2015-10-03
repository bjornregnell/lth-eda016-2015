package week06;

public class IntFinder {
	private int[] xs;

	public IntFinder(int n) {
		xs = new int[n];
	}

	public void set(int index, int data) {
		xs[index] = data;
	}

	public int get(int index) {
		return xs[index];
	}

	/** return index of first occurance of x, or -1 if non-existent */
	public int linearSearch(int x) {
		int pos = 0;
		while (pos < xs.length && xs[pos] != x) {
			pos++;
		}
		if (pos < xs.length) {
			return pos;
		} else {
			return -1;
		}
	}
}