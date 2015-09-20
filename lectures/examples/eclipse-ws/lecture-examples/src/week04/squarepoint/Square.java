package week04.squarepoint;
import se.lth.cs.pt.window.SimpleWindow;

public class Square {
	private Point location; // övre vänstra hörnet
	private int side;       // sidlängd
	
    public Square(int x, int y, int side) {
        this.location = new Point(x, y);
        this.side = side;
    }
    
    public Square(Point location, int side) {
        this.location = location;
        this.side = side;
    }
    
    public void draw(SimpleWindow w) {
    	int x = location.getX();
    	int y = location.getY();
    	w.moveTo(x, y);
    	w.lineTo(x, y + side);
    	w.lineTo(x + side, y + side);
    	w.lineTo(x + side, y);
    	w.lineTo(x, y);
    }
    
    public int getX() {
        return location.getX();
    }

    public int getY() {
        return location.getY();
    }
    
    public void move(int dx, int dy) {
        location.move(dx, dy);
    }
}
