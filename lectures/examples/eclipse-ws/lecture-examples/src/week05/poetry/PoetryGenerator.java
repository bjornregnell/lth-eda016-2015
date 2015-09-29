package week05.poetry;

public class PoetryGenerator {

	public static void main(String[] args) {
		Poetry p = new Poetry();
		p.conversation();
		System.out.print("\n\n\n\n");
		p.generate();
	}

}
