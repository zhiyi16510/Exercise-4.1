package Inheritance;

public class Apple extends Fruit {

	private int quantity, price;

	public Apple(String name, int q, int p) {
		super(name);
		this.quantity = q;
		this.price = p;
	}
	
	public int totalPrice() {
		return this.quantity*this.price;
	}
	
	public int quantity() {
		return this.quantity;
	}
	
	public String toString() {
		return super.toString();
	}
}
