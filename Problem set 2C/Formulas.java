
/**
 * hello
 */

public class Formulas
{
    //quadratic formula
    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double rootPlus = (-b + Math.sqrt ((b * b) - (4 * a * c)))/(2 * a);
        double rootMinus = (-b - Math.sqrt ((b * b) - (4 * a * c)))/(2 * a);
        return new OrderedPair (rootPlus, rootMinus);

    }
    public static double findSLope (OrderedPair a, OrderedPair b) {
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        return ((y2 - y1) / (x2 - x1));
    }
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x1 = A.getX();
        double y1 = A.getY();
        double x2 = B.getX();
        double y2 = B.getY();
        return new OrderedPair (((x1 + x2)/2), ((y1 + y2)/2));
    }
    public static double findArithmeticSeriesSum (double a, double d, int k) {
        return (k / 2) * (2 * a + (d * (k - 1)));
    }
    public static double findGeometricSeriesSum (double a, double r, int k) {
        return a * ((1 - Math.pow(r, k)) / (1 - r));
    }
    public static int rollDice (int sides) {
        return (int)((Math.random () * sides) + 1);
    }
}
