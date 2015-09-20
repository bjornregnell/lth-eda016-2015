package week04.squarepoint;

public class Point {
	int x;
	int y;
	
	/** Skapar en punkt med koordinaterna x, y */
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}; 

	/** Tar reda på x-koordinaten */
	int getX(){
		return x;
	};

	/** Tar reda på y-koordinaten */
	int getY(){
		return y;
	};

	/** Flyttar punkten avståndet dx i x-led, 
	    dy i y-led */
	void move(int dx, int dy){
		x += dx;
		y += dy;
	};
}
