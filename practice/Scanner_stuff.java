
/**
 * Scanner stuff
 *
 * KATE
 * V.452
 */

import java.util.Scanner;


public class Scanner_stuff

{
    public static void main (String [] args) {
        
        Scanner haha = new Scanner (System.in);
        System.out.print ("What's your name? ");
        String name = haha.nextLine();
        
        if (name.equals( "Adyson")) {
        System.out.println ("Hello Adyson Tang. Yes, I know who you are, where");
        System.out.println ("you live, and your IP address. I am currently");
        System.out.println ("gathering your personal information to sell on");
        System.out.println ("the Dark Web");
    } else {
        System.out.print ("What's your favourite course? ");
        String favouriteCourse = haha.nextLine();
        
        System.out.print ("What's your favourite show? ");
        String favouriteShow = haha.nextLine();
        
        System.out.print ("How many hours do you spend studying each day? ");
        int studying = haha.nextInt();
        
        System.out.print ("How many hours do you spend watching shows each day? ");
        int shows = haha.nextInt();
        
        System.out.println (name + ",");
        System.out.println ("your favourite course is " + favouriteCourse);
        System.out.println ("Your favourite show is " + favouriteShow);
        System.out.println ("You spend " + studying + " hours studying each day");
        System.out.println ("You spend " + shows + " hours watching shows each day");
        System.out.println ("In total, you spend " + (studying + shows) + " studying and watching shows each day");
        
        
    }
    haha.close();
    }
}
