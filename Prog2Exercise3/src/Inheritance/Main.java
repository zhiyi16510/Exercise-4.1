package Inheritance;

public class Main {
	public static void main(String[] args) {
		Fruit fruit = new Fruit("Fruits");
		System.out.println(fruit);
		System.out.println();

		Apple apple = new Apple("Apple", 5, 10);
		System.out.println(apple);
		System.out.println("The total price is\t: "+ "RM" +apple.totalPrice()+ "\n");
		
		Melon melon = new Melon("Melon", "Pale Green", "Japan", 5, 250);
		System.out.println(melon);
		System.out.println("The total price is\t: " + "RM" +melon.totalPrice());
		System.out.println("The discount is\t\t: " + "RM" +melon.discount() +"\n");
		
		Papaya papaya = new Papaya("Papaya", 9, 7.8);
		System.out.println(papaya);
		System.out.println("The total price is\t: " + "RM" +papaya.totalPrice());
		System.out.println("The discount is\t\t: " + "RM" +papaya.discount()+"\n");
	
		redApple red = new redApple("Red Apple", "United States", 6, 13, 59, 10.48, 0.44);
		System.out.println(red);
		System.out.println("The total calories is\t: " +red.totalCalories());
		System.out.println("The total sugar is\t: " +red.totalSugar());
		System.out.println("The total protein is\t: " +red.totalProtein());
		System.out.println("The total price is\t: "+ "RM" +red.totalPrice());
		System.out.println("The discount is\t\t: " + "RM" +red.discount()+"\n");
		
		greenApple green = new greenApple("Green Apple", "Australia", 3, 9, 58, 9.59, 97.5);
		System.out.println(green);
		System.out.println("The total calories is\t: " +green.totalCalories());
		System.out.println("The total sugar is\t: " +green.totalSugar());
		System.out.println("The total weight is\t: " +green.totalWeight() +"g");
		System.out.println("The total price is\t: "+ "RM" +green.totalPrice());
		System.out.println("The discount is\t\t: " + "RM" +green.discount()+"\n");
	}

}
