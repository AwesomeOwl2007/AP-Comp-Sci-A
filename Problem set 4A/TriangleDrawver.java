
/**
 * Write a description of class TriangleDrawver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleDrawver
{
    public static void main (String [] args) {
        
        StdDraw.setScale (0, 1);
        OrderedPair p1 = new OrderedPair (0, 0);
        OrderedPair p2 = new OrderedPair (1, 0);
        OrderedPair p3 = new OrderedPair (0.5, 1);
        OrderedPair Selected = new OrderedPair (0, 0);
        int random = 0;
        
        for (int i = 0; i < 10000; i++) {
            random = (int)(Math.random() * 3) + 1;
            if (random == 1) {
                double x = midpoint.findMidpoint(Selected, p1).getX();
                double y = midpoint.findMidpoint(Selected, p1).getY();
                StdDraw.point (x, y);
                Selected.setYX (x, y);
            } else if (random == 2) {
                double x = midpoint.findMidpoint(Selected, p2).getX();
                double y = midpoint.findMidpoint(Selected, p2).getY();
                StdDraw.point (x, y);
                Selected.setYX (x, y);
            } else {
                double x = midpoint.findMidpoint(Selected, p3).getX();
                double y = midpoint.findMidpoint(Selected, p3).getY();
                StdDraw.point (x, y);
                Selected.setYX (x, y);
            }
        }
        
        
        
    }
}
