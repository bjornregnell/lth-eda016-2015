package week12.sorting;

public class StringComparisons {

    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "Sill i dill";

        int compared = s1.compareTo(s2); // se java quickref

        if (compared < 0) {
            System.out.println(s1 + " < " + s2);
        } else if (compared > 0) {
            System.out.println(s1 + " > " + s2);
        } else {
            System.out.println(s1 + " == " + s2);
        }

    }

}
