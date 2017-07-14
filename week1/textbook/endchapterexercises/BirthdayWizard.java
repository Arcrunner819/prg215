/*TO DO:
Given a person's year of birth, the Birthday Wizard can compute the year in which the person's nth birthday will occur or has occured.
Write the statments that the Java program will use to perform this calculation

*/

import java.util.Scanner;

public class BirthdayWizard{
        
    public static void main(String[] args){
        
        int birthYear, yearEntered, result;
        
            
        
        System.out.println("");
        System.out.println("Hello, This program will compute how old you are or will be in a given year.");
        System.out.println("On the first line, please enter your birth year, and then on the second line, what year");
        System.out.println("you would like to figure out your age for.");
        
        
        Scanner enterYear = new Scanner(System.in);
        birthYear = enterYear.nextInt();
        yearEntered = enterYear.nextInt();
        result = yearEntered - birthYear;
        
        System.out.println("You entered your birth year as: " + birthYear);
        System.out.println("and you want to see how old you will be in the year: " + yearEntered);
        System.out.println("So with this information, you will be: " + result + " years old");
        
    }
}