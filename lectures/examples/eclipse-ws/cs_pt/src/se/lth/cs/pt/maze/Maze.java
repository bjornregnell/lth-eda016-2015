package se.lth.cs.pt.maze;

import se.lth.cs.pt.window.SimpleWindow;

import java.util.ArrayList;
import java.util.jar.*;
import java.io.*;
import java.util.Scanner;

/**
 * Describes a maze. The maze definition is read from a file.
 * 
 */
public class Maze {
	/** Where the maze files are. */
	private static final String[] JAR_NAMES = new String[] { "cs_pt.jar",
			"cs_eda016.jar", "cs_eda017.jar" };
	/** Entry and exit coordinates. */
	private int xEntry, yEntry, xExit, yExit;
	/** The walls. */
	private ArrayList<Wall> walls;
	/** The width of a wall. */
	private static final int WALL_WIDTH = 6;

	/**
	 * Creates a maze with number nbr. The maze definition is read from the file
	 * maze<nbr>.maze, which must be in cs_pt.jar, which must be on the class
	 * path.
	 * 
	 * @param nbr
	 *            the number of the maze
	 */
	public Maze(int nbr) {
		walls = new ArrayList<Wall>();
		create(nbr);
	}

	/**
	 * Draws the maze in a window.
	 * 
	 * @param w
	 *            the SimpleWindow to draw in
	 */
	public void draw(SimpleWindow w) {
		int savedLineWidth = w.getLineWidth();
		w.setLineWidth(WALL_WIDTH - 2);
		java.awt.Color savedColor = w.getLineColor();
		w.setLineColor(java.awt.Color.BLUE);
		for (int i = 0; i < walls.size(); i++) {
			Wall wall = walls.get(i);
			if (wall.y1 == wall.y2) {
				w.moveTo(wall.left + 1, wall.y1);
				w.lineTo(wall.right - 1, wall.y2);
			} else {
				w.moveTo(wall.x1, wall.top + 1);
				w.lineTo(wall.x2, wall.bottom - 1);
			}
		}
		w.setLineColor(savedColor);
		w.setLineWidth(savedLineWidth);
	}

	/**
	 * Returns the x coordinate of the entry point.
	 * 
	 * @return the x coordinate
	 */
	public int getXEntry() {
		return xEntry + WALL_WIDTH / 2;
	}

	/**
	 * Returns the y coordinate of the entry point.
	 * 
	 * @return the y coordinate
	 */
	public int getYEntry() {
		return yEntry;
	}

	/**
	 * Checks if the point x,y is at (or near) the exit.
	 * 
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 * @return true if the point is at the exit, false otherwise
	 */
	public boolean atExit(int x, int y) {
		return Math.abs(x - xExit) <= WALL_WIDTH && y == yExit
				|| Math.abs(y - yExit) <= WALL_WIDTH && x == xExit;
	}

	/**
	 * Check if you, when you're in x,y and heading in a given direction, have a
	 * wall directly to the left.
	 * 
	 * @param direction
	 *            the direction (0, 90, 180, 270 degrees)
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 * @return true if there's a wall directly to the left, false otherwise
	 */
	public boolean wallAtLeft(int direction, int x, int y) {
		return inWall(direction + 90, x, y);
	}

	/**
	 * Check if you, when you're in x,y and heading in a given direction, have a
	 * wall directly in front.
	 * 
	 * @param direction
	 *            the direction (0, 90, 180, 270 degrees)
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 * @return true if there's a wall directly in front, false otherwise
	 */
	public boolean wallInFront(int direction, int x, int y) {
		return inWall(direction, x, y);
	}

	/** Väntar ms millisekunder */
	public static void delay(int ms) {
		SimpleWindow.delay(ms);
	}

	// -------------------------------------

	private class Wall {
		int x1, y1, x2, y2; // coordinates
		int top, bottom, left, right; // coordinates for outline of the wall

		/** create a wall, width wide, from x1,y1 to x2,y2 */
		public Wall(int width, int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			int minx = Math.min(x1, x2);
			int maxx = Math.max(x1, x2);
			int miny = Math.min(y1, y2);
			int maxy = Math.max(y1, y2);
			top = miny - width / 2;
			bottom = maxy + width / 2;
			left = minx - width / 2;
			right = maxx + width / 2;
		}

		public boolean touches(int x, int y) {
			return (x >= left && x <= right && y >= top && y <= bottom);
		}
	}

	private boolean inWall(int dir, int x, int y) {
		dir = dir % 360;
		int nextX = x + (int) Math.round(Math.cos(dir * Math.PI / 180));
		int nextY = y - (int) Math.round(Math.sin(dir * Math.PI / 180));
		int i = 0;
		while (i < walls.size() && !walls.get(i).touches(nextX, nextY)) {
			i++;
		}
		return i < walls.size();
	}

	// look up the maze file in one of the supported JAR files, or failing that,
	// as a local stand-alone file
	private Scanner lookupFile(int nbr) throws IOException {
		String mazeFileName = "maze" + nbr + ".maze";

		for (String jarName : JAR_NAMES) {
			JarInputStream jin = getStream(jarName);

			if (jin != null) {
				JarEntry entry = jin.getNextJarEntry();
				while (entry != null && !entry.getName().endsWith(mazeFileName)) {
					entry = jin.getNextJarEntry();
				}
				if (entry != null) {
					return new Scanner(jin);
				}
			}
		}

		return new Scanner(new File(mazeFileName));
	}

	private void create(int nbr) {
		/*
		 * Read the maze file: xExit, yExit, xEntry, yEntry then x1, y1, x2, y2
		 * for each wall
		 */
		try {
			Scanner sc = lookupFile(nbr);
			xExit = sc.nextInt();
			yExit = sc.nextInt();
			xEntry = sc.nextInt();
			yEntry = sc.nextInt();
			while (sc.hasNextInt()) {
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				walls.add(new Wall(WALL_WIDTH, x1, y1, x2, y2));
			}
		} catch (Exception e) {
			System.err.println("Maze error: cannot read maze " + nbr);
			e.printStackTrace();
			System.exit(1);
		}
	}

	/*
	 * Find and open a jar file with the name jarFileName, which is somewhere on
	 * the class path.
	 */
	private JarInputStream getStream(String jarFileName) {
		/*
		 * The following should work, but doesn't:
		 * 
		 * return new
		 * JarInputStream(this.getClassLoader().getResourceAsStream(jarFileName
		 * ));
		 * 
		 * So we must search manually.
		 */

		String fullpath = (System.getProperty("java.class.path")
				+ File.pathSeparator + System.getProperty("java.library.path"));
		Scanner sc = new Scanner(fullpath);
		sc.useDelimiter(File.pathSeparator);
		File f = null;
		while (f == null && sc.hasNext()) {
			String name = sc.next();
			if (name.endsWith(jarFileName)) {
				f = new File(name);
			} else if (!name.endsWith(".jar")) { // directory?
				f = new File(name + File.separator + jarFileName);
			}
			if (f != null && !f.exists()) {
				f = null;
			}
		}
		try {
			if (f == null) {
				return null;
			}
			return new JarInputStream(new FileInputStream(f));
		} catch (FileNotFoundException e1) {
			System.out.println(e1);
			return null;
		} catch (IOException e2) {
			System.out.println(e2);
			return null;
		} finally {
			sc.close();
		}
	}
}
