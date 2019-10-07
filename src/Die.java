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
        roll = generator.nextInt(sides) + 1;
    }//end default constructor
    public Die(int inputSides)
    {
        sides = inputSides;
        roll = generator.nextInt(sides) + 1;
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

    //toString
    public String toString()
    {
     String  output = "" + roll;
     return output;
    }//end toString
}//end class Die
