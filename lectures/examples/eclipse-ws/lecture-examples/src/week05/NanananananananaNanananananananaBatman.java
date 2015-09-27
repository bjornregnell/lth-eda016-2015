package week05;

public class NanananananananaNanananananananaBatman {
	
	public static void measure(int n){
		System.out.println("*** MEASURING n == " + n);
		String s = "";
		StringBuilder sb = new StringBuilder("");
		
		System.out.print("  Singing Batman with String:        ");
		Timer t = new Timer();
		for (int i = 0; i < n; i++){
			s = s + "Nananananananana";
		}
		s = s + " Batman!";
		t.showMillisAndReset();

		System.out.print("  Singing Batman with StringBuilder: ");
		for (int i = 0; i < n; i++){
			sb = sb.append("Nananananananana");
		}
		sb = sb.append(" Batman!");
		
		t.showMillisAndReset();		
	}
	
	public static void main(String[] args) {
		for (int n = 16; n < 1e6; n = n * 2){
			measure(n);
		}
	}

}
