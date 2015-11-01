package week09.tictactoe2;

public class TicTacToeTest {

	public static void main(String[] args) {
		Model m = new Model();
		View v = new View(m);  v.showBoard();  v.showStatus();
		
		// test winner:
		m.markCross (2, 2);    v.showBoard();  v.showStatus();
		m.markNought(0, 0);    v.showBoard();  v.showStatus(); 
		m.markCross (1, 2);    v.showBoard();  v.showStatus();
		m.markNought(0, 2);    v.showBoard();  v.showStatus();
		m.clear();             v.showBoard();  v.showStatus();
		m.markCross (2, 2);    v.showBoard();  v.showStatus();
		m.markNought(0, 2);    v.showBoard();  v.showStatus();
		m.markCross (1, 1);    v.showBoard();  v.showStatus();
		m.markNought(0, 1);    v.showBoard();  v.showStatus();		
		m.markCross (0, 0);    v.showBoard();  v.showStatus();	
		
		
		// test full board:
		boolean isCrossTurn = false;
		for (int row = 0; row < 3; row++){
			for (int col = 0; col < 3; col++){
				if (isCrossTurn) {
					m.markCross(row, col);
				} else {
					m.markNought(row, col);
				}
				isCrossTurn = !isCrossTurn;
			}
		}
		v.showBoard();  
		v.showStatus();
	}
}
