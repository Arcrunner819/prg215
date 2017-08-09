package week2.assignment;
import java.util.Scanner;

public class SyntaxError2 {
		
	public static void main(String[] args) {
		 
		String statement = "Please enter the first number, enter, then the second number.";
		Scanner keyboard = new Scanner(System.in);
		int number1;
		int number2;
		int result;
		int product;
		
		
		System.out.println("Welcome to the mini calculator\n" +
						   "You have a choice of the following operations:\n" +
				            "1 - Multiplication\n" +
						    "2 - Division\n" +
				            "3 - Addition\n" + 
						    "4 - Subtraction\n" +
				            "Please enter the number of your selection below.\n");
		int selection = keyboard.nextInt();
		
		switch (selection) {
			case 1:
				System.out.println(statement);
				number1 = keyboard.nextInt();
				number2 = keyboard.nextInt();
				product = number1 * number2;
				System.out.println("The answer is: " + product);
				break;
			case 2:
				System.out.println(statement);
				number1 = keyboard.nextInt();
				number2 = keyboard.nextInt();
				if (number2 == 0) {
					System.out.println("Warning! You can't divide by zero! Please rerun and try again.");
					break;
				}else {
				result = number1 / number2;
				System.out.println("The answer is: " + result);
				break;
				}
			case 3:
				System.out.println(statement);
				number1 = keyboard.nextInt();
				number2 = keyboard.nextInt();
				result = number1 + number2;
				System.out.println("The answer is: " + result);
				break;
			case 4:
				System.out.println(statement);
				number1 = keyboard.nextInt();
				number2 = keyboard.nextInt();
				result = number1 - number2;
				System.out.println("The answer is: " + result);
				break;
			default:
				System.out.println("Please run again and select a valid option.");
				break;
				
				
		}
		keyboard.close();
		
		 /*System.out.println("Enter two numbers to multiply.");
         Scanner keyboard = new Scanner(System.in);
         int n1 = keyboard.nextInt();
         int n2 = keyboard.nextInt();
         int product = n1 * n2;
         System.out.println("The product is " + product);
         
         */

	}

}
