/* 
 * . Algorithm for roach population program (rough draft) 
 * 1. Get volume of house. 
 * 2. Get initial number of roaches in house. 
 * 3. Compute number of weeks until the house is full of roaches. 
 *      a. weekCount = 0
 *      b. while bugVolume < houseVolume count number of weeks (loop)  
 * 4. Display results.
 */



package week4.textbook;
import java.util.Scanner;

public class BugInfestation{
    public static final double GROWTH_RATE = 0.95;
    public static final double ONE_BUG_VOLUME = 0.002;
    
   
    
    public static void main(String[] args){
        
        System.out.println("Enter the total volume of your house.\n"+
                           "in cubic feet: "  );
        Scanner keyboard = new Scanner(System.in);
        double houseVolume = keyboard.nextDouble();
        System.out.println("Enter the estimated number of roaches in your house");
        int startPopulation = keyboard.nextInt();
        int countWeeks = 0;
        double population = startPopulation;
        double totalBugVolume = population * ONE_BUG_VOLUME;
        double newBugs, newBugVolume;
        
        while(totalBugVolume < houseVolume){
            newBugs = population * GROWTH_RATE;
            newBugVolume = newBugs * ONE_BUG_VOLUME;
            population = population + newBugs;
            totalBugVolume = totalBugVolume + newBugVolume;
            countWeeks++;
            
        }
        
        System.out.println("Starting with a roach population of " +
                            startPopulation);
        System.out.println("and a house with a folume of " + houseVolume +
                           " cubic feet,");
        System.out.println("after " + countWeeks + " weeks");
        System.out.println("the house will be filed with " +
                            (int)population + " roaches");
        System.out.println("They will fill a volume of " +
                            (int)totalBugVolume + " cubic feet");
        System.out.println("Better call Debugging Experts, Inc.");
                            
        
        
        
        keyboard.close();    
    }
  
   
  } 
  
    

   
