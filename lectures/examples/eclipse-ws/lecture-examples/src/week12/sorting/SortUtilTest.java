package week12.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortUtilTest {

    public static void main(String[] args) {
        System.out.println("SortUtilTest");

        System.out.println("\n  insertionSortCopy  xs1 -> xs2");
        ArrayList<Integer> xs1 = SortUtil.newRandomList(10, 42); 
        SortUtil.show(xs1);
        ArrayList<Integer> xs2 = SortUtil.insertionSortCopy(xs1); 
        SortUtil.show(xs2);
        
        System.out.println("\n  selectionSortMove  xs3 -> xs4");
        ArrayList<Integer> xs3 = SortUtil.newRandomList(10, 42); 
        SortUtil.show(xs3);
        ArrayList<Integer> xs4 = SortUtil.selectionSortMove(xs3); 
        SortUtil.show(xs4);
        if (xs3.size() == 0) System.out.println("xs3 is now empty");
        
        System.out.println("\n  insertionSortInPlaceSwap  xs5");
        int[] xs5 = SortUtil.newRandomArray(10, 42); 
        SortUtil.show(xs5);
        SortUtil.insertionSortInPlaceSwap(xs5);
        SortUtil.show(xs5);
        
        System.out.println("\n  insertionSortInPlace  xs6");
        int[] xs6 = SortUtil.newRandomArray(10, 42); 
        SortUtil.show(xs6);
        SortUtil.insertionSortInPlace(xs6);
        SortUtil.show(xs6);
        
        int n = (int) 100000;
        System.out.println("\n\nCreating big random arrays with " + n + " elements ...");
        int[] a = SortUtil.newRandomArray(n, 42); 
        int[] b = Arrays.copyOf(a, a.length);
        int[] c = Arrays.copyOf(a, a.length);
        int[] d = Arrays.copyOf(a, a.length);
        Timer t = new Timer();
        
  /*      System.out.println("\nSorting a with insertion sort...");
        SortUtil.insertionSortInPlace(a);
        t.showMillisAndReset("Insertion sort");
        
        System.out.println("\nSorting b with selection sort...");
        SortUtil.selectionSortInPlace(b);
        t.showMillisAndReset("Selection sort"); 
        
        System.out.println("\nSorting c with Dual-Pivot Quicksort...");
        Arrays.sort(c);  // http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-
        t.showMillisAndReset("Dual-Pivot Quicksort");  */
        
    }

}
