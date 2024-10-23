
/**
 * Write a description of class midpoint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class midpoint
{
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x1 = A.getX();
        double y1 = A.getY();
        double x2 = B.getX();
        double y2 = B.getY();
        return new OrderedPair (((x1 + x2)/2), ((y1 + y2)/2));
    }
}
