import java.util.ArrayList;

/**
 * Write a description of class Goldbach here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goldbach
{
    public static String primes(int n) {
        ArrayList<Integer> listt = sieveOfEratothesesethhste.primeNumbers(n);
        int num1 = 0;
        int num2 = 0;
        
        for (int i = 0; i < listt.size(); i++) {
            for (int k = 0; k < listt.size(); k++) {
                if (listt.get(i) + listt.get(k) == n) {
                    num1 = listt.get(i);
                    num2 = listt.get(k);
                }
            }
        }
        return num1 + "+" + num2;
    }
}
