package week07.equals;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override  // tell the compiler to check that toString() actually exists in superclass
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {     // false if obj is null
			Point other = (Point) obj;  // safe to cast obj to Point
			return x == other.x && y == other.y;
		} else {
			return false;
		}
	}
}
