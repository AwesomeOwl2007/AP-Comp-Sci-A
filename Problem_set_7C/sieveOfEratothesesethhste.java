import java.util.ArrayList;

/**
 * Write a description of class SieveOfEratothesesethhste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sieveOfEratothesesethhste
{
    public static ArrayList<Integer> primeNumbers(int n) {
        ArrayList<Integer> list = new ArrayList();
        int p = 0;
        for (int i = 2; i <= n; i++) { //length = n + 1
            list.add(i);
        }
        if (n >= 2) p = 2;
        
        while (p < n) {
            for (int k = p; k < list.size(); k++) {
                if ((list.get(k) % p) == 0) {
                    list.remove(k);
                    k--;
                }
            }
            p++;
        }
        return list;
    }
}
