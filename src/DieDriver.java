import java.util.Scanner;
public class DieDriver
{
    public static void main(String[] args)
    {
        //var
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of sides: ");
        int numSides = keyboard.nextInt();
        Die myDie =  new Die(numSides);
        //out put
        System.out.println("You rolled: " + myDie);

    }//end main method
}// end die driver class
