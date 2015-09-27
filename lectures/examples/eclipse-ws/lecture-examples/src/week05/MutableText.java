package week05;

public class MutableText {
    private StringBuilder sb;
    
    public MutableText(String s) {
        sb = new StringBuilder(s);
    }

    /** Ändrar alla små bokstäver a-z i texten till motsvarande stora */
    public void changeToUpperCase() {
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, (char) (ch - 'a' + 'A'));
            }
        }
    }

    /** Lägger in ett blanktecken efter varje punkt och kommatecken 
    	i texten, dock ej efter textens sista tecken */
	public void insertSpaces() {
	    int i = 0;
	    while (i < sb.length() - 1) {
	        if (sb.charAt(i) == '.' || sb.charAt(i) == ',') {
	            sb.insert(i + 1, ' ');
	            i++;
	        }
	        i++;
	    }
	}
	
	public String removeSpacesSlow() { // DÅLIGT: Långsamt för stora strängar
	    String result = "";  // Använd StringBuilder
	    for (int i = 0; i < sb.length(); i++) {
	        if (sb.charAt(i) != ' ') {
	            result += sb.charAt(i);
	        }
	    }
	    return result;
	}

	public String removeSpaces() { // BRA: Snabbt även för stora strängar
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < sb.length(); i++) {
	        if (sb.charAt(i) != ' ') {
	        	result.append(sb.charAt(i));
	        }
	    }
	    return result.toString();	
	}
}	
