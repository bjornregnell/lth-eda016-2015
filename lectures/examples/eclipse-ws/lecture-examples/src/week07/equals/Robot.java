package week07.equals;

public class Robot {
	protected String name;  

	public Robot(String name) {
		this.name = name;
	}

	public void work() {
		System.out.println(name + " is working.");
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Robot) {     
			Robot other = (Robot) obj;  
			return name.equals(other.name);
		} else {
			return false;
		}
	}
}