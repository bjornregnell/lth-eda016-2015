package week07.robotclassification;

public class TestRobots {
	public static void main(String[] args) {
		MuteRobot wallE = new MuteRobot();
		TalkingRobot c3po = new TalkingRobot();
		// AbstractRobot r = new AbstractRobot(); //compile error: "Cannot instantiate..."
		wallE.work();
		// wallE.talk(); //compile error: "The method talk() is undefined..."
		c3po.talk();
		c3po.work();
	}
}
