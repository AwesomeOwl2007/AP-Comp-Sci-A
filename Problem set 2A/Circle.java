
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle {
    
    //instance variables
   double radius;
   
   //constructors
   public Circle () { //default constructor
       radius = 1;
   }
   public Circle (double radiuss) { //parameter constructor
       radius = radiuss;
   }
   
   //behaviour methods
   public String toString () {
       return "Hola amigos I am a circle with a radius of " + radius;
   }
   public double getRadius () {
       return radius;
   }
   public double circumference () {
       return 2 * 3.14 * radius;
   }
   public double area () {
       return 3.14 * (radius * radius);
   }
   
}
