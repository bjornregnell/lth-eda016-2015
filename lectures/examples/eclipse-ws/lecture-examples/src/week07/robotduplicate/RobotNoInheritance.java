package week07.robotduplicate;

class Robot {
	public void work() {
		System.out.println("Robot is workign.");
	}
}

class TalkingRobot {
	public void work() {                         // Code duplication with copy-paste.
		System.out.println("Robot is workign."); // Need to fix misspelling in 2 places :(
	}  
	
	public void talk() {
		System.out.println("I shall not harm humans.");
	}
}

public class RobotNoInheritance {
	public static void main(String[] args) {
		Robot wallE = new Robot();
		wallE.work();
		TalkingRobot c3po = new TalkingRobot();
		c3po.talk();
		c3po.work();
	}
}