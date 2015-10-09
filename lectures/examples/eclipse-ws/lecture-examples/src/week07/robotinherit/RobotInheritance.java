package week07.robotinherit;

class Robot {
	public void work() {
		System.out.println("Robot is working.");
	}
}

class TalkingRobot extends Robot {  // TalkingRobot inherits the contents of Robot
	public void talk() {
		System.out.println("I shall not harm humans.");
	}
}

public class RobotInheritance {
	public static void main(String[] args) {
		Robot wallE = new Robot();
		wallE.work();
		TalkingRobot c3po = new TalkingRobot();
		c3po.talk();
		c3po.work();
	}
}