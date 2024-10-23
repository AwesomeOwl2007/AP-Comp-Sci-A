
/**
 * Write a description of class Driver here: It's a Driver
 *
 * @author (your name): me
 * @version (a version number or a date): v100082
 */

import java.util.Scanner;
public class numberDriver
{
    public static void main (String [] args) {
        
        System.out.println ("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        Scanner input = new Scanner(System.in);
        guessNumber stuff = new guessNumber();
        int tries = 1;
        System.out.print ("Your guess: ");
        int result = stuff.guess(input.nextInt()); //result is if the player was correct, or incorrect by how much
        String highLow;
        
        while(result != 1) {
            
            if (result == 2) highLow = "low";
            else if (result == 3) highLow = "high";
            else highLow = "error";
            System.out.println ("Nope, that guess is too " + highLow);
            tries++;
            System.out.print ("Your guess: ");
            result = stuff.guess(input.nextInt());
            
        }
        System.out.println ("You guessed it! It took you " + tries + " tries.");
        
    }
}
