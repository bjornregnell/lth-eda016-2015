package week12.sorting;

import java.util.ArrayList;

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
        
    }

}
