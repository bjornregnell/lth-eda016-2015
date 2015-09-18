package week04;
import se.lth.cs.pt.window.SimpleWindow;

public class Square {
	private int x;		// x- och y-koordinat för 
	private int y;		// övre vänstra hörnet
	private int side;	// sidlängd

	public Square(int x, int y, int side) {
		this.x = x;
		this.y = y;
		this.side = side;
	}
	
	public void draw(SimpleWindow w) {
		w.moveTo(x, y) ;
		w.lineTo(x, y + side);
		w.lineTo(x + side, y + side);
		w.lineTo(x + side, y);
		w.lineTo(x, y);
	}
	
	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
} // Hur implementera getX() getY() getArea()