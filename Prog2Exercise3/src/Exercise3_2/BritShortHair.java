package Exercise3_2;

import java.util.Scanner;

public class BritShortHair extends Cat {
	private int cans;
	private double price;
	
	Scanner in=new Scanner(System.in);

	public BritShortHair(String b, String s, double w, int am, double p, int c) {
		super(b, s, w, am, p);
		cans = c;
	}
	
	public double getTotalam() {
		return super.getTotal();
	}
	
	public int getCal() {
		return cans*240;
	}
	
	public String toString() {
		return super.toString() + "\nThe estimated calories is " +getCal();
	}
	}

