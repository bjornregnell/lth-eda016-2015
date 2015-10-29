package week08.kontrollskrivning;

public class GuitarChord extends Chord {
	private static final String[] tuning = {"E", "A", "D", "G", "B", "E"};
	
	public GuitarChord(String name, int[] grip){
		super(name, grip, tuning);
	}
	
	@Override
	public String toString(){
		return "Guitar " + super.toString();
	}
}