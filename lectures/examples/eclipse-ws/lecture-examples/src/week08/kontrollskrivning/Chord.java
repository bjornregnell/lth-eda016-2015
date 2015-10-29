package week08.kontrollskrivning;

public class Chord {
	private String name;
	private int[] grip;
	private String[] tuning;
	
	public Chord(String name, int[] grip, String[] tuning){
		this.name = name;
		this.grip = grip;
		this.tuning = tuning;
	}
	
	public int numberOfStrings(){
		return tuning.length;
	}
	
	public int lowestFret(){
		int min = Integer.MAX_VALUE;
		int string = 1;
		while (string <= numberOfStrings() && min > 0){
			if (grip[string - 1] < min) {
				min = grip[string - 1];
			}	
			string++;
		}
		return min;
	}
	
	public int highestFret(){
		int max = 0;
		for (int i=0; i < grip.length; i++){
			if (grip[i] > max) {
				max = grip[i];
			}
		}
		return max;
	}
	
	public String getNote(int i){  
		int note = Notes.fromNameToNumber(tuning[i-1]) + grip[i-1];
		return Notes.fromNumberToName(note);
	}
	
	public String fretBoard(){
		StringBuilder result = new StringBuilder();
		int lastFret = Math.max(highestFret(), 4);
		for(int fret=0; fret <= lastFret; fret++){
			char separator = (fret == 0) ? '_' : ' ';
			char unpressed = (fret == 0) ? ' ' : '|';
			result.append(separator);
			for (int string = 1; string  <= numberOfStrings(); string++){
				if (fret == grip[string-1]) {
					result.append("*" + separator);
				} else {
					result.append("" + unpressed + separator);
				}
			}
			result.append(fret + "\n");
		}
		return result.toString();
	}
	
	public String toString(){
		StringBuilder result = new StringBuilder(name + ":");
		for (int string = 1; string <= numberOfStrings(); string++){
			result.append(" " + grip[string-1]);
		}
		result.append(";");
		for (int string = 1; string <= numberOfStrings(); string++){
			result.append(" " + getNote(string));
		}
		return result.toString();
	}
}
