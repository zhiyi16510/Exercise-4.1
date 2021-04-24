package Inheritance;

public class Melon extends Fruit{
	
	private String colour, country;
	private int quantity, price;
	
	public Melon(String name, String c, String co, int q, int p) {
		super(name);
		this.colour = c;
		this.country = co;
		this.quantity = q;
		this.price = p;
	}
	
	public int totalPrice() {
		return this.quantity*this.price;
	}
	
	public double discount() {
		return totalPrice()*0.05;
	}
	
	public String toString() {
		return super.toString() + "\nThe colour is\t\t: " +colour+ "\nThe origin country is\t: " +country;
	}

}
