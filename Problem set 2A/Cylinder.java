
/**
 * Write a description of class Cylinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cylinder
{
    //instance variables
    double height;
    Circle base;
    
    //constructors
    Cylinder () { //default
        
        base = new Circle (1);
        height = 23746189;
    }
    Cylinder (double radiuss, double heightt) {
        base = new Circle (radiuss);
        height = heightt;
    }
    
    
    
    //behaviour methods
    public String toString () {
        return "Greetings I am a cylinder with a radius of " + base.getRadius() + " and a height of " + height;
    }
    public double getRadius () {
        return base.getRadius();
    }
    public double getHeight () {
        return height;
    }
    public double surfaceArea () {
        return (base.circumference() * height) + 2 * (3.14 * (base.getRadius() * base.getRadius()));
    } 
    public double volume() {
        return (3.14 * (base.getRadius() * base.getRadius())) * height;
    }
}
