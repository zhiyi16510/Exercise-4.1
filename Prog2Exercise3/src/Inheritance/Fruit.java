package Inheritance;

public class Fruit {
	private String name;
	
	public Fruit(String name) {
		this.name = name;
		System.out.println(name+" constructor is invoked");
	}
	
	public String toString() {
		return "Fruits\t\t\t: " +name;
	}

}
