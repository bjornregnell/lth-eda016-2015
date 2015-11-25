package week12.searching;

import java.util.Arrays;

public class Data {
    private int[] v;
    private int n;

    public Data(int max) {
        v = new int[max];
        n = 0;
    }
    
    public void add(int elem){
        v[n] = elem;
        n++;
    }
    
    public void add(int[] elems){
        for (int i = n; i < n + elems.length; i++){
            v[i] = elems[i-n];
        }
        n += elems.length;
    }
    
    public void randomize(int toIndex, int max){
        for (int i = 0; i < toIndex; i++){
            v[i] = (int)(Math.random() * max + 1);
        }
        n = toIndex;
    }
    
    public void show(){
        for (int i = 0; i < n; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    
    public int find1(int nbr) {
        int i = 0;
        while (i < n && v[i] != nbr) {
            i++;
        }
        return (i < n) ? i : -1;
    }
    
    public int find2(int nbr) {
        v[n] = nbr;  // lägg till "vaktpost" i slutet
        int i = 0;
        while (v[i] != nbr) {
            i++;
        }
        return (i < n) ? i : -1;
    }
    
    public int find3(int nbr) {
        for (int i = 0; i < n; i++) {
            if (v[i] == nbr) {
                return i;
            }
        }
        return -1;
    }
    
    public int find4(int nbr) {
        boolean found = false;
        int i = 0;
        while (!found && i < n) {
            if (nbr == v[i]) {
                found = true;
            }
            else {
                i++; 
            }
        }
        return (found) ? i : -1;
    }
    
    public void sort(){
        Arrays.sort(v, 0, n);  // https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-int-int-
    }
    
    public int binarySearch(int nbr) {
        int low = 0;      // undre gräns
        int high = n - 1; // övre gräns
        int mid = -1;     // mittpunkt
        boolean found = false;
        while (low <= high && !found) {
            mid = (low + high) / 2;
            if (v[mid] == nbr) {
                found = true;
            } else if (v[mid] < nbr) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (found) ? mid : -(low + 1);
    }

}
