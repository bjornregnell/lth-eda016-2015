package week09.luffarschack;

public class TicTacToe {
	private final static int n = 3;
	private char[][] board = new char [n][n];
	
	public TicTacToe(){
		reset();
	}
	
	public void reset(){
		for (int row = 0; row < n; row ++){
			for (int col = 0; col < n; col ++){
				board[row][col] = ' ';
			}
		}
		
	}
	
	public char getMark(int row, int col){
		return board[row][col];
	}
	
	public boolean isFree(int row, int col){
		return board[row][col] == ' ';
	}

	private boolean mark(char ch, int row, int col){
		if (isFree(row, col)) {
			board[row][col] = ch;
			return true;
		} else {
			return false;
		}
	}

	private boolean isWinner(char lastMark, int lastRow, int lastCol){
		//check row
		int count = 0;
		for (int col= 0; col < n; col++){
			if (board[lastRow][col] == lastMark){
				count++;
			}
		}
		if (count == n) return true;

		//check col
		count = 0;
		for (int row= 0; row < n; row++){
			if (board[row][lastCol] == lastMark){
				count++;
			}
		}
		if (count == n) return true;

		//check diagonal
		count = 0;
		for (int i= 0; i < n; i++){
			if (board[i][i] == lastMark){
				count++;
			}
		}
		if (count == n) return true;

		//check other diagonal
		count = 0;
		for (int i= 0; i < n; i++){
			if (board[n-i-1][i] == lastMark){
				count++;
			}
		}
		if (count == n) return true;

		return false;
	}
	
	public boolean markRing(int row, int col){
		return mark('O', row, col) && isWinner('O', row, col);
	}

	public boolean markCross(int row, int col){
		return mark('X', row, col) && isWinner('X', row, col);
	}	
	
	
	public String toString(){
		StringBuilder result = new StringBuilder("  123\n  ===\n");
		for (int row = 0; row < n; row ++){
			result.append("" + (char)('A' + row) + "|");
			for (int col = 0; col < n; col ++){
				result.append(board[row][col]);
			}
			result.append('\n');
		}		
		return result.toString();
	}
	
}
