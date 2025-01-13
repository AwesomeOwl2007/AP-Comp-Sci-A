
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    /**Instance variable*/
    private int num;
    private int denom;
    
    /** Constructors*/
    public Fraction () {
        num = 1;
        denom = 1;
    }
    public Fraction (int n, int d) {
        setNum(n);
        setDenom(d);
    }
    public Fraction (String fract) {
        num = Integer.parseInt(fract.substring(0, fract.indexOf("/")));
        if (Integer.parseInt(fract.substring(fract.indexOf("/") + 1)) != 0) {
          denom = Integer.parseInt(fract.substring(fract.indexOf("/") + 1));
        } else denom = 1;
    }
    public Fraction (Fraction fractt) {
        num = fractt.getNum();
        denom = fractt.getDenom();
        
    }
    
    /**Accessor methods*/
    public int getNum() {
        return num;
    }
    public int getDenom() {
        return denom;
    }
    public String toString() {
        return "" + num + "/" + denom;
    }
    public double toDouble() {
        return (double) num/denom;
    }
    
    /**Mutator methods*/
    public void setNum (int n) {
        num = n;
    }
    public void setDenom (int d) {
        if (d != 0) denom = d;
        else {
            System.out.println("Denominator can't be zero idiot");
        }
    }
    public void commonDenom (Fraction two) { /**second param is the other fraction*/
        int a1 = num;
        int a2 = denom;
        int b1 = two.getNum();
        int b2 = two.getDenom();
        num = num * b2;
        denom = denom * b2;
        two.setNum(b1 * a2);
        two.setDenom(b2 * a2);
    }
    public void reduce() {
        num /= GCF(Math.abs(num), Math.abs(denom));
        denom /= GCF(num, denom);
    }
    
    /**helper method*/
    public int GCF (int n, int d) {
        if (n != 0 && d != 0) {
            if (n == d) {
                return n;
            }
            return GCF(Math.max(n, d) - Math.min(n, d), Math.min(n, d));
        } return 1;
    }
    
    /**Static methods*/
    public static Fraction multiply (Fraction one, Fraction two) {
        Fraction fractioN = new Fraction();
        fractioN.setNum(one.getNum() * two.getNum());
        fractioN.setDenom(one.getDenom() * two.getDenom());
        fractioN.reduce();
        return fractioN;
    }
    public static Fraction divide (Fraction one, Fraction two) {
        Fraction fractioN = new Fraction();
        fractioN.setNum(one.getNum() * two.getDenom());
        fractioN.setDenom(one.getDenom() * two.getNum());
        fractioN.reduce();
        return fractioN;
    }
    public static Fraction add (Fraction one, Fraction two) {
        Fraction fractioN = new Fraction();
        one.commonDenom(two);
        fractioN.setNum(one.getNum() + two.getNum());
        fractioN.setDenom(one.getDenom());
        fractioN.reduce();
        return fractioN;
    }
    public static Fraction subtract (Fraction one, Fraction two) { /** second param is subtracted from first param*/
        Fraction fractioN = new Fraction();
        one.commonDenom(two);
        fractioN.setNum(one.getNum() - two.getNum());
        fractioN.setDenom(one.getDenom());
        //fractioN.reduce();
        return fractioN;
    }
}
