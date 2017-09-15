package exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) 
	{
		double num1 = 2.50;
		double num2 = 4.50;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter num1 >>");
		num1 = keyboard.nextInt();
		System.out.print("Enter num2 >>");
		num2 = keyboard.nextInt();
	}
	public static void computePercent(double x, double y)
	{ 
		double firstNumber;
		double secondNumber;
		
		firstNumber = x / y * 100;
		secondNumber = y / x * 100;
		System.out.println(String.format("%.0f%%", firstNumber));
		System.out.println(String.format("%.0f%%", secondNumber));
		
		
		System.out.println( num1 + " is " + firstNumber + "percent of " + num2);
		System.out.println( num2 + " is " + secondNumber + "percent of " + num1);
	}

}
