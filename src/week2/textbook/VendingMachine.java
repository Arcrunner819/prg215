package week2.textbook;

/* Vending machines often have small computers to control their operation. In this case study, we will write a program that handles one of the tasks that such a computer
 * would need to perform. The input and output will be performed via the keyboard and screen. To integrate this program into a vending machine computer, you would have
 * to embed the code into a larger program that takes its data from some place other than the keyboard and sends its results to some place other than the screen, but that’s
 * another story. In this case study, the user enters an amount of change from 1 to 99 cents. The program responds by telling the user one combination of coins that equals
 * that amount of change. 
 */

import java.util.Scanner;


/* The following is a sample dialogue with the user:
 * Enter a whole number from 1 to 99.
 * I will find a combination of coins that equals that amount of change. 
 * 87
 *  
 * 87 cents in coins:
 * 3 quarters
 * 1 dime
 * 0 nickels and
 * 2 pennies

 */

/* TODO 
 * 

•Read the amount into the variable amount.
• originalAmount = amount; 
•Set the variable quarters equal to the maximum number of quarters in amount.
•Reset amount to the change left after giving out that many quarters.
•Set the variable dimes equal to the maximum number of dimes in amount.
•Reset amount to the change left after giving out that many dimes.
•Set the variable nickels equal to the maximum number of nickels in amount.
•Reset amount to the change left after giving out that many nickels.
•pennies = amount; 
•Display originalAmount and the numbers of each coin.


*/
public class VendingMachine {
	
	
	public static void main(String[] args) {
		int amount, originalAmount, quarters, dimes, nickels, pennies;
		
		System.out.println("Enter a whole number from 1 to 99");
		System.out.println("I will find a combination of coins");
		Scanner input = new Scanner(System.in);
		amount = input.nextInt();
		
		originalAmount = amount;
		quarters = amount /25;
		amount = amount % 25;
		dimes = amount / 10;
		amount = amount % 10;
		nickels = amount / 5;
		amount = amount % 5;
		pennies = amount;
		
		System.out.println(originalAmount + " cents in coins can be given as:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		System.out.println(" ");
		System.out.println("==========================================");
		
		
		
	}
}


