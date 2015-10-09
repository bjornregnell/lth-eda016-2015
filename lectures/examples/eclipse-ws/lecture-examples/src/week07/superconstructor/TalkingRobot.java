package week07.superconstructor;

public class TalkingRobot extends Robot {
	public TalkingRobot(String name) {
		super(name);
	}

	public void talk() {
		System.out.println(name + " shall not harm humans.");
	}
}
