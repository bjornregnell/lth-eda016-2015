package week12.searching;

public class TestSearch {

    public static void main(String[] args) {
        int max = (int) 1e3;
        Timer t = new Timer();
        System.out.println("\nINITIALIZING... ");
        Data xs = new Data(max);
        t.showMillisAndReset("Initialized: ");
        
        System.out.println("\nRANDOMIZING... ");
        xs.randomize(max - 1, 100);
        t.showMillisAndReset("Randomized: ");

        System.out.println("\nSORTING... ");
        xs.sort();
        t.showMillisAndReset("Sorted: ");

        xs.add(101);
        
        System.out.println("\nSEARCHING...");
        t.reset();
        xs.find4(101);
        t.showNanosAndReset("linear search");
        xs.binarySearch(101);
        t.showNanosAndReset("binary search");
    }

}
