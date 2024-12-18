
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Driver
{
    public static void main (String[] args) {
        String YN = "Y";
        int round = 1;
        while (YN.equals("Y")) {
            Scanner input = new Scanner(System.in);
            Board test = new Board();
            
            boolean isX = true;
            System.out.println("Round " + round);
            test.printBoard();
            
            while(!test.isFull() && test.winner() == -1) {
                String XorO;
                if (isX) XorO = "X";
                else XorO = "O";
                if (test.validMovee()) System.out.print(XorO + ", make your move (row,column): ");
            
                test.updateBoard(input.nextLine(), isX);
                if (test.validMovee()) {
                    System.out.println("Round " + round);
                    test.printBoard();
                    isX = !isX;
                }
            }
            
            if (test.winner() == 1) System.out.println("X wins");
            else if (test.winner() == 2) System.out.println("O wins");
            if (test.isFull()) System.out.println("It's a tie");
            System.out.println("Play again? Y/N");
            YN = input.nextLine();
            round++;
        }
    }
}
