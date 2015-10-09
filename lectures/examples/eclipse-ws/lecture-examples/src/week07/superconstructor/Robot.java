package week07.superconstructor;

public class Robot {
	protected String name;

	public Robot(String name) {
		this.name = name;
	}

	public void work() {
		System.out.println(name + " is working.");
	}
}