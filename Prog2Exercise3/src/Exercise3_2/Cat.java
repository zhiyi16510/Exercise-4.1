package Exercise3_2;

import java.util.Scanner;

public class Cat {

	Scanner in = new Scanner(System.in);
		
		private String breed, size;
		private double weight, price;
		private int amount;
		
		Cat(){
			System.out.print("Enter the breed\t\t\t\t: ");
			this.breed = in.next();
			System.out.print("Enter the size (small, medium or large) : ");
			this.size = in.next();
			System.out.print("Enter the weight\t\t\t: ");
			this.weight = in.nextDouble();
			System.out.print("Enter the amount of cat\t\t\t: ");
			this.amount = in.nextInt();
			System.out.print("Enter the price\t\t\t\t: ");
			this.price = in.nextDouble();
		}
		
		Cat(String b, String s, double w, int am, double p){
			breed = b;
			size = s;
			weight = w;
			amount = am;
			price = p;
		}
		
		public String getBreed() {
			return breed;
		}

		public String getSize() {
			return size;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public int getAmount() {
			return amount;
		}
		
		public double getPrice() {
			return price;
		}
		
		public double getTotal() {
			return price*amount;
		}
		
		public double getConv() {
			return weight*2.2;
		}
		
		public String toString() {
			return "The breed is " +breed+ "\nThe size of the cat is " +size+ "\nThe weight of the cat in kg is " +weight+ "\nAmount of cat you have is " +amount+ "\nThe price of the cat is RM" +price;
		}
}
