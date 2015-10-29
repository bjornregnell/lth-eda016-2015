package week08.kontrollskrivning;

public class NoteTest {

	public static void showNote(String n) {
		System.out.println(n + ": " + Notes.fromNameToNumber(n));
	}

	public static void showNumber(int n) {
		System.out.println(n + ": " + Notes.fromNumberToName(n));
	}
	
	public static void main(String[] args) {
		for(char ch = 'A'; ch <= 'H'; ch++){
			showNote("" + ch);
			showNote("" + ch + "#");
		}	
		for (int i = 0; i < 24; i++) {
			showNumber(i);
		}
	}

}
