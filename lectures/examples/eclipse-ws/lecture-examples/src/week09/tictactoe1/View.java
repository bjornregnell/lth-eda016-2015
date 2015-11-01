package week09.tictactoe1;

import java.util.Scanner;

public class View {
	private Model model;
	private Scanner scan;
	
	public View(Model model){
		this.model = model;
		scan = new Scanner(System.in);
	}
	
	public void showBoard(){
		System.out.print("\n  123\n");
		for (int row = 0; row < 3; row ++){
			System.out.print("" + (char)('A' + row) + "|");
			for (int col = 0; col < 3; col ++){
				System.out.print(model.getMark(row, col));
			}
			System.out.print('\n');
		}	
	}
	
	public void showStatus(){
		char winner = model.getWinner();
		if (winner != ' ') {
			System.out.println("WINNER: " + winner);
		} 
		if (model.isFull()) {
			System.out.println("FULL!");
		}		
	}

	public int[] getMove(boolean isCrossMove){
		char mark = isCrossMove ? 'X' : '0';
		String msg = "Det är " + mark + " som är på tur. Ange position t.ex. A1:";
		boolean isInputOk = false;
		int row = -1;
		int col = -1;
		while(!isInputOk){
			System.out.println(msg);
			String input = scan.next();
			if (input.length() >= 2) {
				row = input.charAt(0) - 'A';
				col = input.charAt(1) - '1';
				isInputOk = model.isInside(row, col) && model.isFree(row, col);
			}
			if (!isInputOk) {
				String explanation = !model.isInside(row, col) ? "FINNS EJ" : "ÄR UPPTAGEN!";
				msg = "\nFel input: " + input + " " + explanation + "\nFörsök igen! ";
			}
		}
		return new int[]{row, col};
	}
}
