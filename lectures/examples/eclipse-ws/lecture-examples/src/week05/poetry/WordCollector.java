package week05.poetry;

import java.util.Random;

public class WordCollector {
	private StringBuilder sb = new StringBuilder();
	private Random rnd = new Random();

	public void append(String s){
		sb.append(s);
	}
	
	public String getRandomWord(){
		if (sb.length() == 0) {
			return "";
		}
		int start = rnd.nextInt(sb.length());
		while (start > 0 && !Character.isWhitespace(sb.charAt(start - 1))) {
			start--;
		}
		int end = start + 1;
		while (end < sb.length() && !Character.isWhitespace(sb.charAt(end))){
			end++;
		}
		return sb.substring(start, end);
	}
}
