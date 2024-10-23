
/**
 * Write a description of class guessNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class guessNumber
{
    //instance variable
    int numberChosen = (int)(Math.random() * 100 + 1);
    
    public int guess (int input) {
        
        if (input == numberChosen) { //correct
            return 1;
        } else if (input - numberChosen < 1) { //too low
            return 2;
        } else return 3; //too high
        
    }
    
}
