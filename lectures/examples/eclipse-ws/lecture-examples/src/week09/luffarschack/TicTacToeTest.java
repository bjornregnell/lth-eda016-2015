package week09.luffarschack;

public class TicTacToeTest {

	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		System.out.println(ttt);
		System.out.println(ttt.markCross(2, 2));
		System.out.println(ttt);
		System.out.println(ttt.markRing(0, 0));
		System.out.println(ttt);
		System.out.println(ttt.markCross(1, 2));
		System.out.println(ttt);
		System.out.println(ttt.markRing(2, 2));
		System.out.println(ttt);
		System.out.println(ttt.markCross(0, 2));
		System.out.println(ttt);
		ttt.reset();
		System.out.println(ttt);
		System.out.println(ttt.markCross(2, 2));
		System.out.println(ttt);
		System.out.println(ttt.markRing(0, 2));
		System.out.println(ttt);
		System.out.println(ttt.markCross(1, 1));
		System.out.println(ttt);
		System.out.println(ttt.markRing(0, 1));
		System.out.println(ttt);
		System.out.println(ttt.markCross(0, 0));
		System.out.println(ttt);
	}
}
