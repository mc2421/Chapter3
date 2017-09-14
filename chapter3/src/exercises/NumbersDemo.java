package exercises;

public class NumbersDemo {

	public static void main(String[] args) 
	{
		int num1 = 5;
		int num2 = 10;
		
		displayTwiceTheNumber(num1, num2);
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
		int i = 2;
		int square = (int) Math.pow(i, 2);
		
	}
}
