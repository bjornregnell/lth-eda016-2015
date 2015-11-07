package week09.tictactoe1;

public class Model {
	private char[][] board = new char [3][3];
	
	public Model(){
		clear();
	}
	
	public void clear(){
		for (int row = 0; row < 3; row ++){
			for (int col = 0; col < 3; col ++){
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

	public void markNought(int row, int col){
		board[row][col] = '0';
	}

	public void markCross(int row, int col){
		board[row][col] = 'X';
	}
	
	public char getWinner(){
        // Kolla alla rader
        for (int i = 0; i < board.length; i++) {
                if     (board[i][0] != ' ' && 
                		board[i][0] == board[i][1] && 
                		board[i][0] == board[i][2]) {
                        return board[i][0];
                }
        }

        // Kolla alla kolumner
        for (int i = 0; i < board[0].length; i++) {
                if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                        return board[0][i];
                }
        }

        // Kolla diagonalerna
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
                return board[0][0];
        }

        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[2][2] == board[2][0]) {
                return board[0][2];
        }

        return ' ';
	}

}
