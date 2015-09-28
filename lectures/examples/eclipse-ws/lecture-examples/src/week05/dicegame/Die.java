package week05.dicegame;

import java.util.Random;

public class Die {
	private static Random rand = new Random();
	private int pips;

	/** Skapar en tärning */
	public Die() {
		roll(); // så att pips får ett initialt värde 1..6
	}

	/** Kastar tärningen */
	public void roll() {
		pips = 1 + rand.nextInt(6);
	}

	/** Tar reda på resultatet av det senaste kastet */
	public int getResult() {
		return pips;
	}
}