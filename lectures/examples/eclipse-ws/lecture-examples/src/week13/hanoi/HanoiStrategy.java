package week13.hanoi;

public class HanoiStrategy {
    private HanoiBoard board;

    /**
     * Skapar en strategi för att flytta brickor på spelplanen board
     */
    public HanoiStrategy(HanoiBoard board) {
        this.board = board;
    }

    /**
     * Flyttar brickorna på pinne 1 till en annan pinne
     */
    public void moveDisks() {
        int moveNbr = 1;
        while (!board.isFinished()) {
            moveOneDisk(moveNbr);
            moveNbr++;
        }
    }

    /**
     * Flyttar en bricka enligt reglerna i drag nummer moveNbr, skriver ut
     * flyttningen
     */
    private void moveOneDisk(int moveNbr) {
        int peg1 = board.getPegWithDiskOne();
        int from; // pinne att flytta en bricka från
        int to; // pinne att flytta en bricka till
        if (moveNbr % 2 != 0) {
            /* udda drag */
            from = peg1;
            to = (from + 1) % 3;
        } else {
            /* jämnt drag */
            from = (peg1 + 1) % 3;
            to = (from + 1) % 3;
            /* se till att den minsta brickan flyttas */
            if (board.getTopDiskSize(from) > board.getTopDiskSize(to)) {
                int temp = from;
                from = to;
                to = temp;
            }
        }
        System.out.println(
                "Flytta bricka " + board.getTopDiskSize(from) + 
                " från pinne " + (from + 1) + 
                " till pinne " + (to + 1));
        board.moveDisk(from, to);
    }
    
}
