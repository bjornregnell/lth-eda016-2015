package week05;

public class Compressor {
	public static String compress(String s) {
	    StringBuilder sb = new StringBuilder();
	    int i = 0;
	    while (i < s.length()) {
	        char ch = s.charAt(i);
	        int nbrEqual = 1;
	        i++;
	        while (i < s.length() && s.charAt(i) == ch) {
	            i++; 
	            nbrEqual++;
	        }
	        if (nbrEqual > 3) {
	            sb.append('$'); 
	            sb.append((char) nbrEqual); 
	            sb.append(ch);
	        } else {
	            for (int k = 0; k < nbrEqual; k++) { 
	                sb.append(ch); 
	            }
	        }
	    }
	    return sb.toString();
	}
	
	public static String decompress(String s) {
	    StringBuilder sb = new StringBuilder();
	    int i = 0;
	    while (i < s.length()) {
	        char ch = s.charAt(i);
	        if (ch != '$') {
	            sb.append(ch);
	        } else {
	            i++;
	            int nbrEqual = s.charAt(i);
	            i++;
	            ch = s.charAt(i);
	            for (int k = 0; k < nbrEqual; k++) {
	                sb.append(ch);
	            }
	        }
	        i++;
	    }
	    return sb.toString();
	}	
}
