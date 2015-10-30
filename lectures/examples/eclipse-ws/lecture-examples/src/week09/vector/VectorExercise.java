package week09.vector;

public class VectorExercise {

	public static void main(String[] args) {
		int[] w;
		w = null;
		System.out.println(w);

		int[] v = new int[5];

		for (int i = 0; i < 5; i++){
			v[i] = 2 * i + 1;
		}
		System.out.println(v[0]);
		System.out.println(v[v[0]]);
		System.out.println(v[v[v[0]]]);
 		System.out.println(v[v[v[v[0]]]]); 
		
		int[] xs = new int[] { 42, 43, 44, 45 };
		int[] ys = { 42, 43, 44, 45 }; // kortform av ovan
		
		
	}

}
