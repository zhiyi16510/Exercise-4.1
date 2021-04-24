package Inheritance;

public class redApple extends Apple{
	
	private String country;
	private int calory, quantity, price;
	private double sugar, protein;
	
	public redApple(String name, String c, int q, int p, int ca, double s, double t) {
		super(name, q, p);
		this.quantity = q;
		this.price = p;
		this.country = c;
		this.calory = ca;
		this.sugar = s;
		this.protein = t;
	}
	
	public int totalCalories() {
		return this.calory*super.quantity();
	}
	
	public double totalSugar() {
		return this.sugar*super.quantity();
	}
	
	public double totalProtein() {
		return this.protein*super.quantity();
	}
	
	public int totalPrice() {
		return this.quantity*this.price;
	}
	
	public double discount() {
		return totalPrice()*0.05;
	}
	
	public String toString() {
		return super.toString() +"\nThe origin country is\t: " +country+ "\nThe protein is\t\t: " +protein;
	}

}
