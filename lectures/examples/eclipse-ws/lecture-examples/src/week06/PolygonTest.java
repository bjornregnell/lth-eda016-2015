package week06;

import se.lth.cs.pt.window.SimpleWindow;

public class PolygonTest {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(400, 400, "Polygon");
		w.setLineWidth(3);
		
		PolygonFixedSize triangle = new PolygonFixedSize(3);
		triangle.addVertex(100, 100);
		triangle.insertVertex(0,200, 100);
		triangle.addVertex(150, 170);
		triangle.draw(w);
		w.waitForMouseClick();
		triangle.draw(w);
		//triangle.insertVertex(1, 100, 100); // ArrayIndexOutOfBoundsException! Varför?
		
		w.waitForMouseClick();
		triangle.move(150, 100);
		triangle.draw(w);
		
		w.waitForMouseClick();
		Polygon p = new Polygon();
		p.addVertex(100, 100);
		p.addVertex(200, 100);
		p.addVertex(150, 170);
		p.addVertex(175, 300);
		p.addVertex(50, 200);
		p.draw(w);
		
		w.waitForMouseClick();
		p.move(150, 100);
		p.insertVertex(5, 10, 10);  // funkar!! Varför?
		p.draw(w);
	}
}