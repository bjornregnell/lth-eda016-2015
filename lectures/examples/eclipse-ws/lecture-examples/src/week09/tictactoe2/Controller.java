package week09.tictactoe;

public class Controller {
	private Model model;
	private View view;

	public Controller() {
		model = new Model();
		view = new View(model);
	}
	
	public void play(boolean isCrossStarting){
		model.clear();
		view.showBoard();
		boolean isCrossMove = isCrossStarting;
		do {
			int[] pos = view.getMove(isCrossMove);
			if (isCrossMove) {
				model.markCross(pos[0], pos[1]);
			} else {
				model.markNought(pos[0], pos[1]);
			}
			view.showBoard();
			isCrossMove = !isCrossMove;
		} while (model.getWinner() == ' ' && !model.isFull());
		view.showStatus();
	}
	
	public static void main(String[] args){
		Controller c = new Controller();
		c.play(Math.random() >= 0.5);
	}
}
