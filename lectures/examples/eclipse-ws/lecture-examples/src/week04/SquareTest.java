package week04;

import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class SquareTest {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Square Test");
		Square s = new Square(10,10,100);
		s.draw(w);
	}

}
