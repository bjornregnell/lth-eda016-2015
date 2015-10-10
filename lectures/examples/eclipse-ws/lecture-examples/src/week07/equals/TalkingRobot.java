package week07.equals;

public class TalkingRobot extends Robot {
	private String phrase;

	public TalkingRobot(String name, String phrase) {
		super(name);                // call constructor in superclass
		this.phrase = phrase;       // extended initialization in this subklass
	}

	public void talk() {
		System.out.println(phrase);
	}

	@Override
	public String toString() { // call the toString() method in superclass
		return "Talking" + super.toString() + " [phrase=" + phrase + "]";
	}                          // what happens if you remove super. ???
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TalkingRobot) {
			TalkingRobot other = (TalkingRobot) obj;
			return name.equals(other.name) && phrase.equals(other.phrase);
		} else {
			return false;
		}
	}
}