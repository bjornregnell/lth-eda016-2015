package week12.dictionary;

public class DictionaryTest {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        dict.insertWord("sex");
        dict.insertWord("laxar");
        dict.insertWord("i");
        dict.insertWord("en");
        dict.insertWord("laxask");
        dict.insertWord("abba");
        dict.insertWord("sill");
        dict.insertWord("i");
        dict.insertWord("dill");
        
        System.out.println(dict.toString());
    }

}
