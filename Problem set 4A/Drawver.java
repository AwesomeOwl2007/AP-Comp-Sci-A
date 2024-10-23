
/**
 * Draw driver
 */
public class Drawver
{
    public static void main (String [] args) {
        
        StdDraw.setScale (0, 500);
        
        int x3 = 600;
        while (x3 > 0) {
            StdDraw.setPenColor (StdDraw.GRAY);
            StdDraw.filledCircle (250, 250, x3);
            x3 -= 10;
            StdDraw.setPenColor (StdDraw.WHITE);
            StdDraw.filledCircle (250, 250, x3);
            x3 -= 10;
        }
        int x = 0;
        StdDraw.setPenColor (StdDraw.BLACK);
        while (x <= 500) {
            StdDraw.line (x, 0, x, 500);
            StdDraw.line (0, x, 500, x);
            x += 20;
        }
        int x2 = 0;
        StdDraw.setPenColor (StdDraw.MAROON);
        while (x2 <= 500) {
            StdDraw.line (x2, 0, 500, x2);
            StdDraw.line (x2, 500, 0, x2);
            x2 += 20;
        }
    }
}
