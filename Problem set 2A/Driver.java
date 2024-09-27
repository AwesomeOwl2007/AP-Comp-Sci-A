
/**
 * Problem set 2A
 * Kate V
 * September 25
 */
public class Driver {
    
    public static void main (String [] args) {
        Circle test = new Circle (12);
        Circle testtest = new Circle (196);
        
        System.out.println (test);
        System.out.println ("The radius of the circle is " + test.getRadius());
        System.out.println ("The circumference of the circle is " + test.circumference());
        System.out.println ("The area of the circle is " + test.area());
        System.out.println (" ");
        
        Cylinder TEST = new Cylinder (12, 12);
        System.out.println (TEST);
        System.out.println ("The radius of the cylinder is " + TEST.getRadius());
        System.out.println ("The height of the cylinder is " + TEST.getHeight());
        System.out.println ("The surface area of the cylinder is " + TEST.surfaceArea());
        System.out.println ("The volume of the cylinder is " + TEST.volume());
        
    }
}
