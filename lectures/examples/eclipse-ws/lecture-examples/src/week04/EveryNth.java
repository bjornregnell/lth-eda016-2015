package week04;

public class EveryNth {

	public static void main(String[] args) {
		int max = 7*22;
		int n = 7;
		for (int i = 0; i <= max; i++) {  // görs (max + 1) gånger
			if (i % n == 0) {
				System.out.println(i + " % " + n + " == 0 JÄMT DELBART MED " + n);
			} else {
				System.out.println(i + " % " + n + " == " + (i % n));
			}
		}
	}

}
