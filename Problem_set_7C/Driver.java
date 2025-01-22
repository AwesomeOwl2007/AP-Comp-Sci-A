
import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Driver
{
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println ("Press 1 for Sieve of Eratothesesethhste");
        System.out.println ("Press 2 for Goldbach Conjecture");
        System.out.println ("Press 3 for Adding BigInts");
        if (input.nextLine().equals("1")) {
            System.out.print("Enter the number parameter: ");
            System.out.println(sieveOfEratothesesethhste.primeNumbers(input.nextInt()));
        }
        else if (input.nextLine().equals("2")) {
            System.out.println(Goldbach.primes(13));
        }
    }
}
