
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Driver
{
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        /*
        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        StringTools test = new StringTools ();
    System.out.println("The last letter is " + test.lastLetter(answer1));
        System.out.println("---------------------");
        
        System.out.println("Format phone number");
        System.out.println("Type in the 10-digit number with no spaces or breaks");
        String answer2 = input.nextLine();
        StringTools test2 = new StringTools ();
        System.out.println ("The formatted phone number is " + test2.formatPhoneNumber(answer2));
        System.out.println("---------------------");
        
        System.out.println("middleThree test");
        System.out.println("Enter a word with at least three characters and an odd number of characters");
        String answer3 = input.nextLine();
        StringTools test3 = new StringTools ();
        System.out.println ("The middle three letters are " + test3.middleThree(answer3));
        System.out.println("---------------------");
        
        System.out.println("swapLastTwo test");
        System.out.println("Enter a word with at least two characters");
        String answer4 = input.nextLine();
        StringTools test4 = new StringTools ();
        System.out.println(test4.swapLastTwo (answer4));
        System.out.println("---------------------"); */
        
        System.out.println("frontAgain test");
        System.out.println("Enter any word");
        String answer5 = input.nextLine();
        System.out.println("Enter a number at maximum the number of characters in the chosen word");
        int answer5b = input.nextInt();
        StringTools test5 = new StringTools ();
        System.out.println(test5.frontAgain(answer5, answer5b));

        
    }
}
