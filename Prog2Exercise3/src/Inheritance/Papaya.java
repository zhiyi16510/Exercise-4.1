package Inheritance;

public class Papaya extends Fruit{
	
	private int quantity;
	private double price;
	
	public Papaya(String name, int q, double p) {
		super(name);
		this.quantity = q;
		this.price = p;
	}
	
	public double totalPrice() {
		return this.quantity*this.price;
	}
	
	public double discount() {
		return totalPrice()*0.04;
	}
	
	public String toString() {
		return super.toString();
	}

}
