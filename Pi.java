
/**
 * Makes pie
 *
 * @author Kate V
 * @version 4000
 */
public class Pi
{
    public static Fraction findPi (Fraction fract) { /**@param Fraction (from the Pi method)*/
        Fraction piFract = new Fraction();
        Fraction MILU = new Fraction (355, 113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
        if (Math.abs( Math.PI - fract.toDouble()) < EPSILON) {
            return fract;
        } 
        if (fract.toDouble() < Math.PI) {
            fract.setNum(fract.getNum() + 1);
            findPi(fract);
        } else {
            fract.setDenom(fract.getDenom() + 1);
            findPi(fract);
        }
        return fract;
    }
}
