// The following program has run-time errors. Find and Fix the errors.

import java.util.Scanner;

public class SemanticError
{
    public static void main(String[] args)
    {
        int height=0, width=0, depth=0;
        System.out.println("Enter the height, width, and depth of");
        System.out.println("a box and I will compute the volume.");
        Scanner keyboard = new Scanner(System.in);
        height = keyboard.nextInt();
        width = keyboard.nextInt();
        /* Original program omited the input for depth, so
        the program computed the volume as 0. Width * Height * depth, yet depth
        never took an input value, so initialized value was used. Correction below */
       
       depth = keyboard.nextInt();
        
        int volume = height * width * depth;
        System.out.println("The volume is " + volume);
    }
}


