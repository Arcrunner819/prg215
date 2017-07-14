/* Write statements that can be used in a Java program to read two integers
and display the number of integers that lie between them, including the integers
themselves. for eg: four integers are between 3 and 6: 3, 4, 5, and 6 */

import java.util.Scanner;

public class NumberChecker 
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Number Checker!");
        System.out.println("In a moment, I'm going to ask you to input 2 numbers,");
        System.out.println("and then I'm going to tell you all the numbers in between");
        
        int startNumber;
        int endNumber;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("OK, let's get started. Please enter the first number, hit enter, then enter the second number");
                
        startNumber = keyboard.nextInt();
        endNumber = keyboard.nextInt();
        
        System.out.println("=======================================================");
        for(int i=startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
        
        
    }

}