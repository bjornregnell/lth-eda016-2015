package week06;
import java.util.Scanner;

public class CollaborationBonus {
	private int[] bonus;
	private int nextFreePos = 0;

	public CollaborationBonus(int numberOfGroupMembers){
		bonus = new int[numberOfGroupMembers];
	}
	
	public void addIndividualBonus(int b){
		bonus[nextFreePos] = b;
		nextFreePos++;
	}
	
	public int getGroupBonus(){
		double sum =0;
		for (int i = 0; i < nextFreePos; i++){
			sum += bonus[i];
		}
		double average = sum / nextFreePos;
		return (int) Math.round(average);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange antalet gruppmedlemmar :");
		int n = scan.nextInt();
		CollaborationBonus cb = new CollaborationBonus(n);
		System.out.println("Ange " + n + " st individuella bonuspoäng: ");
		for (int i = 0; i < n; i++) {
			cb.addIndividualBonus(scan.nextInt());
		}
		System.out.println("Gruppbonus: " + cb.getGroupBonus());
		scan.close();
	}
}
