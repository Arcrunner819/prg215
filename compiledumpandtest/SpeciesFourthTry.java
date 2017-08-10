import java.util.Scanner;
import static java.lang.System.out;

public class SpeciesFourthTry
{
    private String name;
    private int population;
    private double growthRate;
    
    public void setSpecies(String newName, int newPopulation, double newGrowthRate)
    {
        name = newName;
        if (newPopulation >=0)
            population = newPopulation;
        else
        {
            out.println(
                "ERROR: using a negative population");
                System.exit(0);
        }
        growthRate = newGrowthRate;
    }
    public String getName()
    {
        return name;
    }
    public int getPopulation()
    {
        return population;
    }
    public double getGrowthRate()
    {
        return growthRate;
    }
}