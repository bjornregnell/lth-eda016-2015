package week07.register;

public class Test {
	private Student[] students;
	private int n;
	
	/** Skapar ett prov med plats för max studenter */
	public Test(int max) {
		students = new Student[max];
		n = 0;
	}
	
	/** Lägger till studenten s */
	public void add(Student s) {
		students[n] = s;
		n++;
	}
	
	/** Skriver ut antalet studenter som har 0, 1, ..., 
	    50 poäng på provet */
	public void printStatistics() {
		int[] count = new int[51];
		for (int i = 0; i < n; i++) {
			int index = students[i].getPoints();
			count[index]++;
		}
		System.out.println("Poäng\tAntal studenter");
		for (int index = 0; index < count.length; index++) {
			System.out.println(index + "\t" + count[index]);
		}
	}
	
	/** Skriver ut antalet studenter som har 0-9, 10-19, 20-29,
	    30-39, 40-50 poäng */
	public void printStatistics2() {
		int[] count = new int[5];
		for (int i = 0; i < n; i++) {
			int index = students[i].getPoints() / 10;
			if (index == 5) { // om antalet poäng var 50
				index = 4;
			}
			count[index]++;
		}
		System.out.println("Poäng\tAntal studenter");
		int low = 0;
		int high = 9;
		for (int index = 0; index < count.length - 1; 
				index++) {
			System.out.println(low + "-" + high + "\t" + 
			                   count[index]);
			low += 10;
			high += 10;
		}
		high = 50;
		System.out.println(low + "-" + high + "\t" + 
		                   count[count.length - 1]);  
	}
}

