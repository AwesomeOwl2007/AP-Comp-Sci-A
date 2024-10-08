
/**
 * :)
 */
public class OrderedPair
{
    //instance variables
    double x;
    double y;
    
    //constructors
    OrderedPair () {
        x = 0.0;
        y = 0.0;
    }
    OrderedPair (double X, double Y) {
        x = X;
        y = Y;
    }
    
    //behaviour methods
    public String toString () {
        return "(" + x + "," + y + ")";
    }
    public double getX () {
        return x;
    }
    public double getY () {
        return y;
    }
}
