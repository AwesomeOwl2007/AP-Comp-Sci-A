
/**
 * Write a description of class StringTools here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTools
{
    //Instance variables
    /*String input;
    
    //COnstructors
    StringTools () {
        input = "I like apples";
    }
    StringTools (String innput) {
        input = innput;
    } */
    
    //Behaviour methods
    public String lastLetter (String input) {
        return input.substring (input.length() - 1);
    }
    public String formatPhoneNumber (String input) {
        return "(" + input.substring (0, 3) + ") " + input.substring (3, 6) + " " + input.substring (6, input.length());
    } 
    public String middleThree (String input) {
        return input.substring ((input.length() / 2) - 1, (input.length() / 2) + 2);
    }
    public String swapLastTwo (String input) {
        return input.substring (0, input.length() - 2) + input.substring (input.length() - 1) + input.substring (input.length() - 2, input.length() -1);
    }
    public boolean frontAgain (String input, int n) {
        return input.substring (0, 0 + n).equals (input.substring (input.length() - n, input.length()));
    }
}
