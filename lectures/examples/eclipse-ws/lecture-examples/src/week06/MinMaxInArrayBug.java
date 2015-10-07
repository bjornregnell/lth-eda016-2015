package week06;
import java.util.Random;

public class MinMaxInArrayBug {
	public static void main(String[] args) {
		int n = 1;
		Random rnd = new Random();
		double[] rs = new double[n];
		for (int i = 0; i < n; i++){ // populate the array
			rs[i] = Math.round(rnd.nextDouble()*100)/100.0; 
			System.out.print(rs[i] + " ");
		}
		System.out.println();
		double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++){ // Find minimum & maximum in one sweep
			if (rs[i] < min) {
				min = rs[i];
			} else if (rs[i] > max) {
				max = rs[i];
			}
		}
		System.out.println("min: " + min + "  max: " + max);
	}
	// CAN YOU FIND THE BUG??? Try changing line 6 to: int n = 1;
}