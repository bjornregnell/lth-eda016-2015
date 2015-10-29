package week08.kontrollskrivning;

public class Notes {
	private static final String[] notes = 
		{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
	
	public static int fromNameToNumber(String note){
		int i = 0;
		while (i < notes.length && !notes[i].equals(note)){
			i++;
		}
		return i < 12 ? i : -1;
	}
	
	public static String fromNumberToName(int i){
		return notes[i % 12];
	}
}
