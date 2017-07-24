package week2.assignment;

import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 * Tsubo is a Japanese unit of measure for area. 1 Tsubo is equal to 35.58 square feet.
 * Write a program that asks the user if they want to convert from Tsubo to square feet or from square feet to Tsubo.
 * Include code that asks users to input a number to convert. The code should also display the converted unit.
 */
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;
	
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
              	
        double sqftInput;
        double sqftResult;
        double tsuboInput;
        double tsuboResult;
        
        if(userInput == 1) {
        	
        	
        	System.out.println("You have chosen to convert square feet to Tsubo");
        	System.out.println("Please enter the total sqft you are looking to convert");
        	
        	sqftInput = keyboard.nextDouble();
        	
        	// Double is converted to string so out put remains an object of the same data type
        	sqftResult = sqftInput / TSUBO;
        	DecimalFormat sqftFormatted = new DecimalFormat("#####.00");
        	String resultOut = sqftFormatted.format(sqftResult);
        	System.out.println(sqftInput + " is equal to :" + resultOut  + " Tsubo");
        	
        	
        } else if(userInput == 2 ) {
        	
        	System.out.println("You have chose to convert TSUBO to sqft");
        	System.out.println("Please enter the total Tsubo you are trying to convert");
        	
        	tsuboInput = keyboard.nextDouble();
        	
        	// Follows same logic above. Double is converted to string so output remains an object of the same data type, and variables can be reused if expanding
        	tsuboResult = tsuboInput * TSUBO;
        	DecimalFormat tsuboFormatted = new DecimalFormat("#####.00");
        	String tsuboOut = tsuboFormatted.format(tsuboResult);
        	
        	System.out.println(tsuboInput + " is equal to: " + tsuboOut + " sqft");
        	
        } else {
        	System.out.println("Please enter a valid selection");
        }
        // Reduces memory leak by closing scanner object
        keyboard.close();
    }
        		
}