package week05.poetry;

import java.util.Random;
import java.util.Scanner;

public class Poetry {
	private WordCollector wc = new WordCollector();
	private Scanner scan = new Scanner(System.in);
	private Random rnd = new Random();

	public Poetry() {
		wc.append("värme hetta sol mörker natt kölden månen regnet vinden");
	}

	private void ask(String q) {
		System.out.println(q);
		wc.append(" " + scan.nextLine());
		System.out.println();
	}

	public void conversation() {
		ask("Vad tänker du på?");
		for (int i = 1; i <= 2; i++) {
			ask("Vilka adjektiv förknippar du med " + wc.getRandomWord() + "?");
			ask("Hur upplever du att " + wc.getRandomWord() + " påverkar dig?");
		}
	}
	
	public void generate(){
		String title = wc.getRandomWord() + " i " + wc.getRandomWord();
		System.out.println(title.toUpperCase() + "\n");
		int nVerses = 2;
		for (int verse = 0; verse < nVerses; verse++) {
			int nRows = 4;
			for (int row = 0; row < nRows; row++) {
				int nWords = rnd.nextInt(3) + 2;
				for (int word = 0; word < nWords; word++) {
					System.out.print(wc.getRandomWord() + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
