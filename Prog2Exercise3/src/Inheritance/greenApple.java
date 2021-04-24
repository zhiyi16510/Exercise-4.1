package Inheritance;

public class greenApple extends Apple{

	private String country;
	private int calory, price, quantity;
	private double sugar, weight;
	
	public greenApple(String name, String c, int q, int p, int ca, double s, double w) {
		super(name, q, p);
		this.price = p;
		this.quantity = q;
		this.country = c;
		this.calory = ca;
		this.sugar = s;
		this.weight = w;
	}
	
	public int totalCalories() {
		return this.calory*super.quantity();
	}
	
	public double totalSugar() {
		return this.sugar*super.quantity();
	}
	
	public int totalPrice() {
		return this.price*this.quantity;
	}
	
	public double discount() {
		return totalPrice()*0.02;
	}
	
	public double totalWeight() {
		return this.quantity*weight;
	}
	
	public String toString() {
		return super.toString() + "\nThe origin country is\t: " +country+ "\nThe weight is\t\t: " +weight;
	}
	
}
