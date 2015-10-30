package week09.tictactoe;

class Result {
	private double crossThinkTime;
	private double noughtThinkTime;
	private char winner;
	
	public Result(double crossThinkTime, double noughtThinkTime, char winner) {
		this.crossThinkTime = crossThinkTime;
		this.noughtThinkTime = noughtThinkTime;
		this.winner = winner;
	}

	public double getCrossElapsed() {
		return crossThinkTime;
	}

	public double getNoughtElapsed() {
		return noughtThinkTime;
	}

	public char getWinner() {
		return winner;
	}
}
