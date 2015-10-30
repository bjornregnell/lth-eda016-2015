package week09.tictactoe;

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
		int count = 0;
		for (int col= 0; col < 3; col++){
			if (board[lastRow][col] == lastMark){
				count++;
			}
		}
		if (count == 3) return lastMark;

		//check col
		count = 0;
		for (int row= 0; row < 3; row++){
			if (board[row][lastCol] == lastMark){
				count++;
			}
		}
		if (count == 3) return lastMark;

		//check diagonal
		count = 0;
		for (int i= 0; i < 3; i++){
			if (board[i][i] == lastMark){
				count++;
			}
		}
		if (count == 3) return lastMark;

		//check other diagonal
		count = 0;
		for (int i= 0; i < 3; i++){
			if (board[2-i][i] == lastMark){
				count++;
			}
		}
		if (count == 3) return lastMark;

		return ' ';
	}

}
