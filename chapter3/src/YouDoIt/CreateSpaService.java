package YouDoIt;

import java.util.Scanner;

public class CreateSpaService {

	public static void main(String[] args) {
		String service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter serice >>> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		
		firstService.setServiceDescription(service);
		firstService.sePrice(price);
		
		keyboard.nextLine();
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("enter price >> ");
		price = keyboard.nextDouble();
		secondService.setServicedescription(service);
		secondService.setprice(price);
		
		System.out.println("First service details:");
			System.out.println(firstService.getServiceDescription() + 
		" $" + secondService.getPrice());
			
		System.out.println("Second service details:");
		
		
		

	}

}
