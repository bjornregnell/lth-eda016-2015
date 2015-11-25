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

	public static ArrayList<Integer> insertionSortCopy(ArrayList<Integer> unsorted) {
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		for (int elem : unsorted) {
			// leta upp rätt position
			int pos = 0; // när är det bättre om vi istället gör letar bakifrån?
			while (pos < sorted.size() && sorted.get(pos) < elem) {
				pos++;
			}
			// stoppa in på rätt plats
			sorted.add(pos, elem);
		}
		return sorted;
	}

	public static ArrayList<Integer> selectionSortMove(ArrayList<Integer> unsorted) {
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		while (unsorted.size() > 0) {
			int indexOfMin = 0;
			for (int i = 1; i < unsorted.size(); i++) { // sök minsta bland ännu
														// ej sorterade
				if (unsorted.get(i) < unsorted.get(indexOfMin)) {
					indexOfMin = i;
				}
			}
			// lägg sist i sekvensen med sorterade
			int x = unsorted.remove(indexOfMin);
			sorted.add(x);
		}
		return sorted;
	}

	public static void selectionSortInPlace(int[] xs) {
		for (int i = 0; i < xs.length - 1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1; // funkar ej med 0 men med i?
			// sök minsta bland ännu ej sorterade
			for (int k = i; k < xs.length; k++) {
				if (xs[k] < min) {
					min = xs[k];
					minIndex = k;
				}
			}
			// byt plats mellan xs[i] och xs[minIndex]
			xs[minIndex] = xs[i];
			xs[i] = min;
		}
	}

	private static void swap(int[] xs, int a, int b) {
		int temp = xs[a];
		xs[a] = xs[b];
		xs[b] = temp;
	}

	public static void insertionSortInPlaceSwap(int[] xs) {
		for (int i = 1; i < xs.length; i++) {
			int j = i;
			while (j > 0 && xs[j - 1] > xs[j]) {
				swap(xs, j, j - 1);
				j = j - 1;
			}
		}
	}

	public static void insertionSortInPlace(int[] xs) {
		for (int i = 1; i < xs.length; i++) {
			int current = xs[i];
			int j = i;
			while (j > 0 && xs[j - 1] > current) {
				xs[j] = xs[j - 1];
				j--;
			}
			xs[j] = current;
		}
	}

}
