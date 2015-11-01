package week09.tictactoe0;
//Implementera konstruktor och metodstubbar
public class Model {   
	private char[][] board = new char [3][3];
	
	public Model(){
	}
	
	public void clear(){
	}
	
	public char getMark(int row, int col){
		return ' ';
	}
	
	public boolean isFree(int row, int col){
		return true;
	}

	public boolean isInside(int row, int col){
		return true;
	}	
	
	public boolean isFull(){
		return true;
	}

	public void markNought(int row, int col){
	}

	public void markCross(int row, int col){
	}
	
	public char getWinner(){
		return ' ';
	}
}