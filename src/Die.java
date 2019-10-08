import java.util.*;
public class Die
{
    //instance variables
    int sides;
    int roll;
    Random generator = new Random();

    //constructors
    public Die()
    {
        sides = 6;
        roll = checkSides();
    }//end default constructor
    public Die(int inputSides)
    {
        sides = inputSides;
        roll = checkSides();
    }//end single arg constructor

    //getters
    public int getSides()
    {
        return sides;
    }//end getSides
    public int getRoll()
    {
        return roll;
    }//end getRoll

    //Setters
    public void setSides(int newSides)
    {
        sides = newSides;
    }//end setSides
    public void setRoll(int newRoll)
    {
        roll = newRoll;
    }//end setRoll

    //brain methods
    private int checkSides()
    {
        if (sides>0)
        {
            return generator.nextInt(sides) + 1;
        }
        return generator.nextInt(6) + 1;
    }//check if num sides is valid
    //toString
    public String toString()
    {
     String  output = "" + roll;
     return output;
    }//end toString
}//end class Die
