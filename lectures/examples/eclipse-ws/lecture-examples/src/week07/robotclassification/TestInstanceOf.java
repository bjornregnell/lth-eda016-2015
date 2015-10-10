package week07.robotclassification;
public class TestInstanceOf {
	public static void main(String[] args) {
		MuteRobot wallE = new MuteRobot();
		TalkingRobot c3po = new TalkingRobot();
		if (wallE instanceof MuteRobot) {
			System.out.println("Wall-E kan inte prata");
		}
		//if (wallE instanceof TalkingRobot) { // compile error
		//	System.out.println("Wall-E kan inte prata");
		//}
		if (c3po instanceof TalkingRobot) {
			System.out.println("C3PO kan prata");
		}		
		if (wallE instanceof AbstractRobot){
			System.out.println("Wall-E kan arbeta");
		}
		if (c3po instanceof AbstractRobot){
			System.out.println("C3PO kan arbeta");
		}
		if (wallE instanceof Object && c3po instanceof Object){
			System.out.println("Wall-E och C3PO är javaobjekt.");
		}
		TalkingRobot r = null;
		if (r instanceof TalkingRobot){ // Is this true or false??
			   System.out.println(r + " instanceof TalkingRobot == true");
		} else System.out.println(r + " instanceof TalkingRobot == false");
   }
}