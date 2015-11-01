package week09.matrix;

public class MatrixExample {

	public static void main(String[] args) {
		// deklaration och allokering:
		int m[][] = new int[5][4];
		
		// tilldelning:
		m[0][0] = 42;
		m[1] = new int[] { 42, 43, 44, 45 };
		// avvikande antal kolumner ok i Java
		m[3] = new int[] { -1, -2 };          
		
		System.out.println("Matrisen m:");
		
		// nästlade for-loopar:  
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, {9, 10, 11, 12} };
		
		System.out.println("\nRadsummorna i matrix:");
		for (int row = 0; row < matrix.length; row++) {
			int sum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				sum = sum + matrix[row][col];
			}
			System.out.println("row" + "[" + row + "]: " + sum);
		}		
	}
}
