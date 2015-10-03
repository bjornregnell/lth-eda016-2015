package week06;

import java.util.Random;

public class MinInArray {
	public static void main(String[] args) {
		int n = 100;
		Random rnd = new Random();
		double[] rs = new double[n];
		for (int i = 0; i < n; i++) { // populate the array
			rs[i] = Math.round(rnd.nextDouble() * 100) / 100.0;
			System.out.print(rs[i] + " ");
		}
		System.out.println();
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) { // Find minimum
			if (rs[i] < min) {
				min = rs[i];
			}
		}
		System.out.println("min: " + min);
	}
}