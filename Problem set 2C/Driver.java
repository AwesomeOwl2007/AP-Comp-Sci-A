
/**
 * Kate V
 * Ordered pairs stuff
 * problem set 2C
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*System.out.println ("Quadratic Roots Calculator");
        System.out.println ("Enter the a, b, and c values");
        System.out.print ("a: ");
        double a = input.nextDouble();
        System.out.print ("b: ");
        double b = input.nextDouble();
        System.out.print ("c: ");
        double c = input.nextDouble();
        System.out.println ("The quadratic roots of the equation are " + Formulas.findQuadraticRoots (a, b, c));
        System.out.println ("");
        
        System.out.println ("Slope Calculator");
        System.out.print ("Enter first x value: ");
        double x1 = input.nextDouble();
        System.out.print ("Enter first y value: ");
        double y1 = input.nextDouble();
        System.out.print ("Enter second x value: ");
        double x2 = input.nextDouble();
        System.out.print ("Enter second y value: ");
        double y2 = input.nextDouble();
        System.out.println ("The slope of the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + Formulas.findSLope (new OrderedPair(x1, y1), new OrderedPair (x2, y2)));
        */
        System.out.println ("Midpoint Calculator");
        System.out.print ("Enter first x value: ");
        double X1 = input.nextDouble();
        System.out.print ("Enter first y value: ");
        double Y1 = input.nextDouble();
        System.out.print ("Enter second x value: ");
        double X2 = input.nextDouble();
        System.out.print ("Enter second y value: ");
        double Y2 = input.nextDouble();
        OrderedPair printFirst = new OrderedPair(X1, Y1);
        OrderedPair printSecond = new OrderedPair(X2, Y2);
        System.out.println ("The midpoint between " + printFirst + " and " + printSecond + " is " + Formulas.findMidpoint (printFirst, printSecond));
        System.out.println ("");
        
        System.out.println ("Arithmetic Series Sum Calculator");
        System.out.print ("Enter the first term ");
        double a = input.nextDouble();
        System.out.print ("Enter the difference between each term ");
        double d = input.nextDouble();
        System.out.print ("Enter the number of terms ");
        int k = input.nextInt();
        System.out.println ("The sum of the arithmetic series is " + Formulas.findArithmeticSeriesSum (a, d, k));
        System.out.println ("");
        
        System.out.println ("Geometric Series Sum Calculator");
        System.out.print ("Enter the first term ");
        double A = input.nextDouble();
        System.out.print ("Enter the common ratio between terms ");
        double R = input.nextDouble();
        System.out.print ("Enter the number of terms ");
        int K = input.nextInt();
        System.out.println ("The sum of the geometric series is " + Formulas.findGeometricSeriesSum (A, R, K));
        System.out.println ("");
        
        System.out.println ("Dice roller");
        System.out.print ("Enter the number of sides on the dice");
        int sides = input.nextInt();
        System.out.println ("The number rolled is " + Formulas.rollDice(sides));
        
    }
}
