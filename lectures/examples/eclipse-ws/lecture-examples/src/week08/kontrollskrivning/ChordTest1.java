package week08.kontrollskrivning;

public class ChordTest1 {
	public static void show(Chord c) {
		System.out.print(c);
		System.out.print("; Fret range [" + c.lowestFret());
		System.out.println(", " + c.highestFret() + "]");
	}

	public static void main(String[] args) {
		Chord guitarEminor = new GuitarChord("Em", new int[]{0, 2, 2, 0, 0, 0});
		show(guitarEminor);

		Chord ukuleleDmajor = new UkuleleChord("D", new int[]{0, 0, 0, 3});
		show(ukuleleDmajor);
	}
}
