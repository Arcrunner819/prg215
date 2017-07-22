package week2.assignment;

/**
 * Tsubo is a Japanese unit of measure for area. 1 Tsubo is equal to 35.58 square feet.
 * Write a program that asks the user if they want to convert from Tsubo to square feet or from square feet to Tsubo.
 * Include code that asks users to input a number to convert. The code should also display the converted unit.
 */
import java.util.Scanner;
	
public class TsuboConverter
{
    public static final double TSUBO = 35.58; // Named constant - value of TSUBO does not change
    
    public static void main(String[] args)
    {
        
    	Scanner keyboard = new Scanner(System.in);
        
    	// Interact with the user and establish what the program does
    	System.out.println("Welcome to the Tsubo calculator.");
        System.out.println("If you want to convert square feet (sqft) to Tsubo, please press 1. ");
        System.out.println("If you want to conver Tsubo to square feet, please press 2");
        
        int userInput = keyboard.nextInt();
        
        //declare variables at class level for use in conditional logic
        String sqftResultAsString;       	
        double sqftInput;
        double sqftResult;
        String sqftResultFormat;
        
        //
        if(userInput == 1) {
        	
        	
        	System.out.println("You have chosen to convert square feet to Tsubo");
        	System.out.println("Please enter the total sqft you are looking to convert");
        	
        	sqftInput = keyboard.nextInt();
        	
        	sqftResult = sqftInput / TSUBO;
        	sqftResultAsString = String.valueOf(sqftResult); //Creates string representation of result double value so that it can be formatted
        	sqftResultFormat = String.format("%,.2f", sqftResultAsString);
        	
        	
        	
        	System.out.println(sqftInput + " is equal to :" + sqftResultFormat  + " Tsubo");
        	
        	
        } /*else if(userInput == 2 ) {
        	
        	System.out.println("You have chose to convert TSUBO to sqft");
        	System.out.println("Please enter the total Tsubo you are trying to convert");
        	
        	double tsuboInput = keyboard.nextInt();
        	result = tsuboInput * TSUBO;
        	
        	System.out.println(tsuboInput + " is equal to: " + result + " sqft");
        	
        } */else {
        	System.out.println("Please enter a valid selection");
        }
    }
    		
}