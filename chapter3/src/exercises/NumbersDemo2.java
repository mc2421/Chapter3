package exercises;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) 
	{
		int num1 = 5;
		int num2 = 10;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter num1 >>");
		num1 = keyboard.nextInt();
		System.out.print("Enter num2 >>");
		num2 = keyboard.nextInt();
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared();
	}
	public static void displayTwiceTheNumber(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * 2;
		secondNumber = y * 2;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
	}
	
	public static void displayNumberPlusFive(int x, int y)
	{
		int thirdNumber = x + 5;
		int fourthNumber = y + 5;
		
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
	}
	public static void displayNumberSquared()
	{
		int x = 5;
		int square = (int) Math.pow(x, 2);
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter x >>");
		x = keyboard.nextInt();
		System.out.println(square);
		
		
		
	}
}
