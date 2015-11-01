package week09.tictactoe2;

public class TimedController {
	private Model model;
	private View view;
	private double crossThinkTime;
	private double noughtThinkTime;
	private int crossWins;
	private int noughtWins;
	
	public TimedController() {
		model = new Model();
		view = new View(model);
	}
	
	public void play(boolean isCrossStarting){
		model.clear();
		view.showBoard();
		Timer crossTimer = new Timer();
		Timer noughtTimer = new Timer();

		boolean isCrossMove = isCrossStarting;
		do {
			if (isCrossMove) {
				crossTimer.start();
			} else {
				noughtTimer.start();
			}
			int[] pos = view.getMove(isCrossMove);
			if (isCrossMove) {
				model.markCross(pos[0], pos[1]);
			} else {
				model.markNought(pos[0], pos[1]);
			}
			view.showBoard();
			isCrossMove = !isCrossMove;
			crossTimer.pause();
			noughtTimer.pause();
		} while (model.getWinner() == ' ' && !model.isFull());
		view.showStatus();
		crossThinkTime += crossTimer.elapsedSeconds();
		noughtThinkTime += noughtTimer.elapsedSeconds();
		if (model.getWinner() == 'X') {
			crossWins++;
		} else if (model.getWinner() == '0') {
			noughtWins++;
		}
	}
	
	public void timeDuell(){
		System.out.println("OMGÅNG 1: KRYSSET BÖRJAR");
		play(true);
		System.out.println("OMGÅNG 2: NOLLAN BÖRJAR");
		play(false);
		if (crossWins > noughtWins) {
			System.out.println("KRYSSET SEGRADE!!!");
		} else if (crossWins < noughtWins) {
			System.out.println("NOLLAN SEGRADE!!!");
		} else {
			System.out.print("LIKA MÅNGA VINSTER MEN ");
			if (crossThinkTime < noughtThinkTime) {
				System.out.println("KRYSSET SEGRADE PÅ SNABBHET!!!");
			} else {
				System.out.println("NOLLAN SEGRADE PÅ SNABBHET!!!");
			}
		}		
	}
	
	public static void main(String[] args){
		TimedController c = new TimedController();
		c.timeDuell();
	}
}
