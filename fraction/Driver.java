
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String[] args) {
        
       /**Fractory - Fraction factory*/
       Fraction hi = new Fraction();
       Fraction hello = new Fraction(9, 4);
       Fraction hola = new Fraction("16/5");
       
       System.out.println("four operations");
       System.out.println(Fraction.add(hello, hola));
       //System.out.println(Fraction.subtract(hola, hello));
       System.out.println(Fraction.divide(hello, hola));
       System.out.println(Fraction.multiply(hello, hola));
        
    }
}
