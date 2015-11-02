package week09.tictactoe2;

public class Model {
	private char[][] board = new char [3][3];
	private int lastRow;
	private int lastCol;
	
	public Model(){
		clear();
	}
	
	public void clear(){
		for (int row = 0; row < 3; row ++){
			for (int col = 0; col < 3; col ++){
				board[row][col] = ' ';
			}
		}
		lastRow = -1;
		lastCol = -1;
	}
	
	public char getMark(int row, int col){
		return board[row][col];
	}
	
	public boolean isFree(int row, int col){
		return board[row][col] == ' ';
	}

	public boolean isInside(int row, int col){
		return row >= 0 && row < 3 && col >= 0 && col < 3 ;
	}	
	
	public boolean isFull(){
		for (int row = 0; row < 3; row ++){
			for (int col = 0; col < 3; col ++){
				if (isFree(row, col)) return false;
			}
		}
		return true;
	}

	private void mark(char ch, int row, int col){
			board[row][col] = ch;
			lastRow = row;
			lastCol = col;
	}

	public void markNought(int row, int col){
		mark('0', row, col);
	}

	public void markCross(int row, int col){
		mark('X', row, col);
	}
	
	public char getWinner(){
		if (lastRow == -1 || lastCol == -1) return ' ';
		char lastMark = board[lastRow][lastCol];
		
		//check row
		if (board[lastRow][0] == lastMark &&
			board[lastRow][1] == lastMark &&
			board[lastRow][2] == lastMark) {
			return lastMark;
		}

		//check col
		if (board[0][lastCol] == lastMark &&
			board[1][lastCol] == lastMark &&
			board[2][lastCol] == lastMark) {
			return lastMark;
		}

		//check diagonal
		if (board[0][0] == lastMark &&
			board[1][1] == lastMark &&
			board[2][2] == lastMark) {
			return lastMark;
		}

		//check other diagonal
		if (board[0][2] == lastMark &&
			board[1][1] == lastMark &&
			board[2][0] == lastMark) {
				return lastMark;
		}

		// no winner found
		return ' ';
	}

}
