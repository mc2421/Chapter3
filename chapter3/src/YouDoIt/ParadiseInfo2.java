package YouDoIt;

import java.util.Scanner;

public class ParadiseInfo2 {

	public static void main(String[] args) {
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		System.out.print("Enter discount rate as whole number >> ");
		discount = keyboard.nextDouble();
		savings = computeDiscountInfo(price, discount);
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a svings of at leat $" + savings);
		
	}
	private static double computeDiscountInfo(double price, double discount) {
	
		double savings; 
		savings = price * discount / 100;
		return savings;
	}

}