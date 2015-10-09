package week07.register;

import java.util.Random;

public class Student {
	private static Random rand = new Random();
	private int points;

	public Student() {
		// points = rand.nextInt(51);
		do {
			points = (int) Math.round(25 + 10 * rand.nextGaussian());
		} while (points < 0 || points > 50);
	}

	/** Tar reda på studentens poäng på provet */
	public int getPoints() {
		return points;
	}
}

