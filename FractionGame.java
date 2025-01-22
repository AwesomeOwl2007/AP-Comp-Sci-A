
/**
 * Write a description of class FractionGame here.
 *
 * @author Kate V
 * @version 43905
 */
public class FractionGame
{
    int wins;
    int rounds;
    int percent;
    Fraction answer = new Fraction();
    
    public FractionGame () {
        wins = 0;
        rounds = 0;
    }
    
    public void question () {
        Fraction one = randomFract();
        Fraction two = randomFract();
        System.out.print(one + " + " + two + " = ");
        answer = Fraction.add(one, two);
    }
    public void win (String string) {
        Fraction response = new Fraction (string);
        response.reduce();
        rounds++;
        if (compare(response, answer)) {
            System.out.println("Correct!");
            wins++;
        } else {
            System.out.println("Incorrect, the answer was " + answer);
        }
    }
    public void endGame () {
        System.out.println("Too much for you, eh? Your win/loss ratio was " + wins + "/" + rounds + " for a score of " + (int)percentage(wins, rounds) + "%.");
    }
    
    private static boolean compare (Fraction one, Fraction two) {
        if (one.getNum() == two.getNum() && one.getDenom() == two.getDenom()) return true;
        return false;
    }
    private static Fraction randomFract () {
        Fraction hi = new Fraction ((int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1));
        hi.reduce();
        return hi;
    }
    public static double percentage (int num, int denom) {
        return Math.round(100 * ((double) num / denom));
    }
}
