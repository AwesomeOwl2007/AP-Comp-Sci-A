
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
        
       /**Fractory - Fraction factory*/
       Fraction hi = new Fraction(-1000, 25);
       Fraction hello = new Fraction(9, 4);
       Fraction hola = new Fraction("16/5");
       
       System.out.println("four operations (to test)");
       System.out.println(Fraction.add(hello, hola));
       System.out.println(Fraction.subtract(hello, hola));
       System.out.println(Fraction.divide(hello, hola));
       System.out.println(Fraction.multiply(hello, hola));
       
       /**Pi bakery*/
       System.out.println("");
       System.out.println("Have some pie");
       Fraction test = new Fraction(52150, 16444);
       // Pi hi = new Pi(test);
       // System.out.println(hi.Pi());
       System.out.println(Pi.findPi(test));
       
       /**Fraction game*/
       System.out.println("");
       System.out.println("Welcome to Fraction Game. Enter 'Quit' to end game.");
       FractionGame aloha = new FractionGame();
       String response = "";
       aloha.question();
       response = input.nextLine();
       while(!response.equals("Quit")) {
           aloha.win(response);
           aloha.question();
           response = input.nextLine();
       }
       aloha.endGame();
    }
}
