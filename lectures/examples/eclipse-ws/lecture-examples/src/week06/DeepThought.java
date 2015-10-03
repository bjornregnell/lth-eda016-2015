package week06;

public class DeepThought {
	public static void main(String[] args) {
		int n = 21;
		IntFinder ints = new IntFinder(n);
		for (int i = 0; i < n; i++) {
			ints.set(i, (int) (Math.random() * 42) + 1);
			System.out.print("ints[i] == " + ints.get(i) + " ");
		}
		int found = ints.linearSearch(42);
		if (found >= 0) {
			System.out.println("\n\nFound the Answer to " + 
					"the Ultimate Question of Life, the Universe, and Everything!");

		} else {
			System.out.println("\n\nSORRY: NOT FOUND!");
		}
	}
}
