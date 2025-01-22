
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
    public Fraction (int n, int d) { /**@param input numerator and denominator for a fraction*/
        setNum(n);
        if (d != 0) { setDenom(d);
        } else {
            setDenom(1);
            System.out.println("Denominator can't be zero idiot");
        }
    }
    public Fraction (String fract) { /**Pre-condition: fract is in format #/#. @param String fraction*/
        num = Integer.parseInt(fract.substring(0, fract.indexOf("/")));
        if (Integer.parseInt(fract.substring(fract.indexOf("/") + 1)) != 0) {
          denom = Integer.parseInt(fract.substring(fract.indexOf("/") + 1));
        } else {
            denom = 1;
            System.out.println("Denominator can't be zero idiot");
        }
    }
    public Fraction (Fraction fractt) { /**Pre-condition: denominator is not 0. @param Fraction for copying*/
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
    public void setNum (int n) { /**@param numerator*/
        num = n;
    }
    public void setDenom (int d) { /**@param denominator*/
        if (d != 0) denom = d;
        else {
            System.out.println("Denominator can't be zero idiot");
        }
    }
    public void commonDenom (Fraction two) { /**@param the other fraction*/
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
        int factor = GCF(Math.abs(num), Math.abs(denom));
        num /= factor;
        denom /= factor;
    }
    
    /**helper method*/
    public static int GCF (int a, int b) { /**Pre-condition: a and b are positive. @param the two numbers (first they're num and denom)*/
        if (a > 0 && b > 0) {
            if (a == b) {
                return a;
            }
            return GCF(Math.max(a, b) - Math.min(a, b), Math.min(a, b));
        } return 1;
    }
    
    /**Static methods*/
    public static Fraction multiply (Fraction one, Fraction two) { /**@param the fractions being multiplied together*/
        Fraction fractioN = new Fraction();
        fractioN.setNum(one.getNum() * two.getNum());
        fractioN.setDenom(one.getDenom() * two.getDenom());
        fractioN.reduce();
        return fractioN;
    }
    public static Fraction divide (Fraction one, Fraction two) { /**@param the divided fraction. @param the divider fraction*/
        Fraction fractioN = new Fraction();
        fractioN.setNum(one.getNum() * two.getDenom());
        fractioN.setDenom(one.getDenom() * two.getNum());
        fractioN.reduce();
        return fractioN;
    }
    public static Fraction add (Fraction one, Fraction two) { /**@param both fractions being added together*/
        Fraction fractioN = new Fraction();
        one.commonDenom(two);
        fractioN.setNum(one.getNum() + two.getNum());
        fractioN.setDenom(one.getDenom());
        fractioN.reduce();
        return fractioN;
    }
    public static Fraction subtract (Fraction one, Fraction two) { /**@param the subtracted. @param the subtractor*/
        Fraction fractioN = new Fraction();
        one.commonDenom(two);
        fractioN.setNum(one.getNum() - two.getNum());
        fractioN.setDenom(one.getDenom());
        fractioN.reduce();
        return fractioN;
    }
    
    /**debug stuff*/
    public static Fraction reduce (Fraction one) {
        Fraction fractioN = one;
        fractioN.reduce();
        return fractioN;
    }
    public static int GCFtest (int a, int b) {
        return GCF(a, b);
    }
}
