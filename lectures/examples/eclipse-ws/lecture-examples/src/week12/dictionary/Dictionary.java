package week12.dictionary;

public class Dictionary {
    private String[] words;
    private int n;

    public Dictionary() {
        n = 0;
        words = new String[1000]; // Svårt att välja värde
    }

    public void insertWord(String word) {  //insättningssortering
        int pos = 0;
        // sök rätt position
        while (pos < n && words[pos].compareTo(word) < 0) {
            pos++;
        }
        // skapa plats genom att flytta fram bakifrån
        for (int i = n; i > pos; i--) {
            words[i] = words[i - 1];
        }
        words[pos] = word;
        n++;
    }
    
    public boolean contains(String word){
        for(String w: words){
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb.append(words[i] + " ");
        }
        return sb.toString();
    }
    

}
