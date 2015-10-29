package week08.kontrollskrivning;

public class UkuleleChord extends Chord {
	private static final String[] tuning = {"A", "D", "F#", "B"};

	public UkuleleChord(String name, int[] grip) {
		super(name, grip, tuning);
	}
	
	@Override
	public String toString(){
		return "Ukulele " + super.toString();
	}
}