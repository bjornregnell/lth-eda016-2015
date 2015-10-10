package week07.superconstructor;

public class TestSuperConstructor {
	public static void main(String[] args) {
		Robot wallE = new Robot("Wall*E");
		TalkingRobot c3po = new TalkingRobot("C-3PO");
		wallE.work();
		c3po.talk();
		c3po.work();		
	}
}