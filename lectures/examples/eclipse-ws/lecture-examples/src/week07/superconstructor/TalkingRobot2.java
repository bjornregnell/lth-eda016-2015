package week07.superconstructor;

public class TalkingRobot2 extends Robot {
	private String phrase;
	
	public TalkingRobot2(String name, String phrase) {
		super(name);  // call superclass constructor
		this.phrase = phrase;
	}

	public void talk() {
		System.out.println(name + " says: " + phrase); 
	}
}
