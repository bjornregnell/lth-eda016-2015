package week08.kontrollskrivning;

public class ChordTest2 {
	public static void show(Chord c) {
		System.out.print(c);
		System.out.print("; Fret range [" + c.lowestFret());
		System.out.println(", " + c.highestFret() + "]");
		System.out.println(c.fretBoard());
	}

	public static void main(String[] args) {
		Chord guitarGmajor = new GuitarChord("G", new int[]{3, 5, 5, 4, 3, 3});
		show(guitarGmajor);

		Chord ukuleleDmajor = new UkuleleChord("D", new int[]{0, 0, 0, 3});
		show(ukuleleDmajor);
	}
}
