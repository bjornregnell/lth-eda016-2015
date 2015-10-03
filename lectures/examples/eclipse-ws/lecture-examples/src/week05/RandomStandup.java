package week05;

import java.util.Random;
import se.lth.cs.pt.window.SimpleWindow;

public class RandomStandup {
	public static void main(String[] args) throws InterruptedException {
		int n = 50;
		int ySize = 300;
		SimpleWindow w = new SimpleWindow(400, ySize + 30, "Slumpgymnastik");
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++){
			if (i*n % ySize == 0) {
				w.clear();
			}
			w.moveTo(20, (i*n + 15) % ySize);
			char ch = (char) (random.nextInt('Z' - 'A' + 1) + 'A');
			int index = sb.indexOf("" + ch);
			if (index < 0) { 
				w.writeText(i + ": " + "STÅ UPP om ditt namn innehåller " + ch);
				sb.append(ch);
			} else {
				w.writeText(i + ": " + "SITT NER om ditt namn innehåller " + ch);
				sb.deleteCharAt(index);
			}
			Thread.sleep(6000);
		}
		Thread.sleep(6000);
		w.close();
	}
}