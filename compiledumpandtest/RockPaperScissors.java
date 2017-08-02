/**
 * Write a program to play the rock-paper-scissors game. 
 * Two users take turns entering R, P, or S. 
 * The program then announces the winner, based on the rule
 *  that paper covers rock, rock breaks scissors, scissors cut paper.
 */


import java.util.Scanner;
import java.util.Random; //Using Random class for scalability moving foward **Can also use Math.random() instead

public class RockPaperScissors
{
   
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String compSelection ="";
        int compMoveGenerator = (int)(Math.random() * 3 + 1); 
        
        
        System.out.println("We've all played \'Rock\', \'Paper\', \'Scissors\' before\n" +
                           "Now let's see if you can beat the computer");
        System.out.println("Please select your choice [R/P/S]: ");
        String user_input = keyboard.nextLine().toUpperCase();
        
        
        switch(compMoveGenerator)
        {
            case 1:
                compSelection = "R";
                break;
            case 2:
                compSelection = "P";
                break;
            case 3:
                compSelection = "S";
                break;
            
                
                
        }
        
        //Organizes Losing conditions:
        if(compSelection.equals("R") && user_input.equals("S")) {
            System.out.println("Rock beats Scissors. You Lose!");
        } else if(compSelection.equals("P") && user_input.equals("R")){
            System.out.println("Paper wraps Rock. You Lose!");
        } else if(compSelection.equals("S") && user_input.equals("P")){
            System.out.println("Scissors cuts paper. You Lose!");
        }
        //Organizes Winning Conditions:
          else if(compSelection.equals("R") && user_input.equals("P")){
             System.out.println("Paper Wraps Rock. You Win!"); 
        } else if(compSelection.equals("P") && user_input.equals("S")){
            System.out.println("Scissors cuts paper. You Win!");
        } else if(compSelection.equals("S") && user_input.equals("R")){
            System.out.println("Rock beats Scissors. You Win!");    
        } 

        // Organizes Tie Conditions:
          else if (compSelection.equals(user_input)) {
             System.out.println("Hmmm, looks like we havea tie. Run again!");
              
        } else {
            System.out.println("Are you sure you entered a valid selection?");
        }
        
            
              

    }
    
}