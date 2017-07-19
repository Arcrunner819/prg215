package week1.textbook;

import java.util.Scanner; //gets Scanner class from java.util package(library)

public class FirstProgram { //Class name should match File name.java
    
    public static void main(String[] args) {
        System.out.println("Hello There."); //Sysout sends output to screen
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");
        
        int n1, n2; //declares n1 and n2 as variables that holds integers
        
        Scanner keyboard = new Scanner(System.in); //Readies program for keyboard input
        n1 = keyboard.nextInt(); //reads a whole number from keyboard
        n2 = keyboard.nextInt(); //see above
        
        System.out.println("The sum of those two numbers is");
        System.out.println(n1 + n2);
        
    }
}