package week06;

import java.util.Scanner;

public class ArrayWithObjects {

	public static void main(String[] args) {
		Point[] points = new Point[10]; // 10 referenser, alla null från början
		//points[0].getX(); // ger NullPointerException
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange 10 heltalspar med \"whitespace\" emellan:");
		for (int i = 0; i < points.length; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			points[i] = new Point(x, y);
			System.out.println("Point:" + points[i]);
		}
		scan.close();
	}

}
