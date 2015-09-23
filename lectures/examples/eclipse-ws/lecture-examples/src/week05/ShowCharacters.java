package week05;

public class ShowCharacters {
	
	public static void showChar(char c){
		System.out.print(c + " == " + (int) c + "   ");
	}
	

	public static void main(String[] args) {
		
		for (char c = '0'; c <= '9'; c ++) {
			showChar(c);
		}		

		System.out.print("\n\n\n");
		
		for (char c = 32; c <= 1000; c ++) {
			showChar(c);
			if ((c - ' ' + 1) % 10 == 0) {
				System.out.print("\n");
			}
		}
		
		System.out.println("\n\n unicode 955: \u03BB");
	}
}
