package week2.textbook;

//Program that demonstrates the Scanner methods

import java.util.Scanner;

public class ScannerDemo {
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); //sets up program to accept keyboard input
        System.out.println("Enter two whole numbers");
        System.out.println("separated by one or more spaces: ");
        
        int n1, n2;
        
        n1 = keyboard.nextInt(); //Reads one int from keyboard
        n2 = keyboard.nextInt();
        
        System.out.println("You entered " + n1 + " and " + n2);
        System.out.println("Next enter 2 numbers.");
        System.out.println("A decimal point is OK.");
        
        double d1, d2;
        
        d1 = keyboard.nextDouble(); //Reads one double from keyboard
        d2 = keyboard.nextDouble();
        
        System.out.println("You entered " + d1 + " and " + d2);
        System.out.println("Next enter two words");
        
        String s1, s2;
        
        s1 = keyboard.next(); //reads one word from keyboard
        s2 = keyboard.next();
        
        System.out.println("You entered \"" +
                            s1 + "\" and \"" + s2 + "\"");
        s1 = keyboard.nextLine(); //to get rid of '\n'
        System.out.println("Next, enter a line of text: ");
        s1 = keyboard.nextLine(); //reads entire line
        System.out.println("You entered: \"" + s1 + "\"");
        
        keyboard.close();
        
        
        
    }
}
