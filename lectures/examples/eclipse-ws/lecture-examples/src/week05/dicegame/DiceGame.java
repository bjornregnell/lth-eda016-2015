package week05.dicegame;

public class DiceGame {
    private Player player1;
    private Player player2;
    private Die die;
    
    /** Skapar ett spel som spelas mellan spelarna
        player1 och player2 */
    public DiceGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        die = new Die();
    }
    
    /** Genomför en spelomgång, returnerar vinnaren */
    public Player play() {
        int p1Rolls = player1.play(die);
        int p2Rolls = player2.play(die);
        while (p1Rolls == p2Rolls) {
            p1Rolls = player1.play(die);
            p2Rolls = player2.play(die);
        }
        return (p1Rolls < p2Rolls) ? player1 : player2;  //villkors-uttryck
    }
}
