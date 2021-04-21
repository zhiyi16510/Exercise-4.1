package Exercise3_2;

public class Main {

	public static void main(String[] args) {
		Cat sphnyx = new Cat();
		System.out.println("\n ****** SPHNYX CAT ******");
		System.out.println(sphnyx);
		System.out.println("The total price is RM" +sphnyx.getTotal());
		System.out.println("The weight of the cat in lbs is " +sphnyx.getConv());
		System.out.println();
		
		System.out.println(" ****** BRITISH SHORTHAIR ****** ");
		BritShortHair objbrit = new BritShortHair("British Short Hair", "Medium", 10.1, 2, 3500, 4);
		System.out.println(objbrit);
		System.out.println("The total price is RM" +objbrit.getTotalam());
		System.out.println("The estimated calories is " +objbrit.getCal());
	}

}
