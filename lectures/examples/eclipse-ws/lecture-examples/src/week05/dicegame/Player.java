package week05.dicegame;

public class Player {
    private String name;
    
    /** Skapar en spelare med namnet name */    
    public Player(String name) {
		this.name = name;
	}

    /** Tar reda på spelarens namn */
	public String getName() {
		return name;
	}
	
	/** Spelaren kastar tärningen die tills det blir 
        två lika i följd, returnerar antalet kast */
    public int play(Die die) {
        die.roll();
        int prevResult = die.getResult();
        die.roll();
        int result = die.getResult();
        int nbrRolls = 2;
        while (result != prevResult) {
            die.roll();
            nbrRolls = nbrRolls + 1;
            prevResult = result;
            result = die.getResult();
        }
        return nbrRolls;
    }
}
