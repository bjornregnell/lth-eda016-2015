package week05.dicegame;

public class PlayGame {
    public static void main(String[] args) {
        Player p1 = new Player("Kim");
        Player p2 = new Player("Robin");
        DiceGame game = new DiceGame(p1, p2);
        Player winner = game.play();
        System.out.println(winner.getName() +  " vann");
    }
}
