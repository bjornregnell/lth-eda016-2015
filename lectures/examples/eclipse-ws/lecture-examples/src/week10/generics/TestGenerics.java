package week10.generics;

import java.util.ArrayList;

public class TestGenerics {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hej");
        words.add("på");
        words.add("dej");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(i + ": " + words.get(i));
        }
    }

}
