package week12.sorting;

import java.util.ArrayList;

public class SortUtil {

    public static void show(int[] xs) {
        for (int x : xs) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void show(ArrayList<Integer> xs) {
        for (int x : xs) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] newRandomArray(int n, int max) {
        int[] xs = new int[n];
        for (int i = 0; i < xs.length; i++) {
            xs[i] = (int) (Math.random() * max + 1);
        }
        return xs;
    }

    public static ArrayList<Integer> newRandomList(int n, int max) {
        ArrayList<Integer> xs = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            xs.add(i, (int) (Math.random() * max + 1));
        }
        return xs;
    }
    
    public static ArrayList<Integer> insertionSortCopy(ArrayList<Integer> xs){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int x: xs){
            // find the right poosition for x in result
            int pos = 0;
            while (pos < result.size() && result.get(pos) < x){
                pos++;
            }
            // insert x in result
            result.add(pos, x);
        }
        return result;
    }

    public static ArrayList<Integer> selectionSortMove(ArrayList<Integer> xs){
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (xs.size() > 0){
            // find index of minimum value in xs
            int indexOfMin = 0;
            for (int i = 1; i < xs.size(); i++){
                if (xs.get(i) < xs.get(indexOfMin)) {
                    indexOfMin = i;
                }
            }
            // move that element at the end of result
            int x = xs.remove(indexOfMin);
            result.add(x);
        }
        return result;
    }    
    
    public static void swap(int[] xs, int a, int b){
        int temp = xs[a];
        xs[a] = xs[b];
        xs[b] = temp; 
    }
    
    public static void insertionSortInPlaceSwap(int[] xs){
        for (int i = 1; i < xs.length; i++) {
            int j = i;
            while (j > 0 && xs[j - 1] > xs[j]){
                swap(xs, j, j - 1);
                j = j - 1;
            }
        }
    }    

    public static void insertionSortInPlace(int[] xs){
        for (int i = 1; i < xs.length; i++) {
            int current = xs[i];
            int j = i;
            while (j > 0 && xs[j - 1] > current){
                xs[j] = xs[j - 1];
                j--;
            }
            xs[j] = current;
        }
    }  
    
    public static void selectionSortInPlace(int[] xs){

    }      
   
}
