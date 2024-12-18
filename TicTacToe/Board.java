
/**
 * Write a description of class board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    // instance variables - replace the example below with your own
    char[][]count;
    boolean validMove = true;

    /**
     * Constructor for objects of class board
     */
    public Board()
    {
        count = new char[3][3];
        for(int i = 0; i <= count.length - 1; i++) { //row number
            for (int n = 0; n <= count[0].length - 1; n++) {
                count[i][n] = ' ';
            }
        }
    }
    
    //methods
    public static int yCoord (String coord) {
        if (coord.indexOf(",") != -1) return Integer.parseInt(coord.substring(0, coord.indexOf(","))) - 1;
        return -1;
    }
    public static int xCoord (String coord) {
        if (coord.indexOf(",") != -1) return Integer.parseInt(coord.substring(coord.indexOf(",") + 1)) - 1;
        return -1;
    }
    public boolean validMovee () {
        if (validMove) return true;
        return false;
    }
    public void updateBoard (String move, boolean X) {
        int y = Board.yCoord(move);
        int x = Board.xCoord(move);
        //Checks to make sure the move is valid
        if (y >= 0 && y <= 2 && x >= 0 && x <= 2 && count[y][x] == ' ') {
            if (X) count[y][x] = 'X';
            else count[y][x] = 'O';
            validMove = true;
        } else {
            System.out.println("That is not a valid move");
            validMove = false;
        }
    }
    public void printBoard () {
        for (int row = 0; row <= count.length - 1; row++) {
            for (int column = 0; column <= count[0].length - 1; column++) {
                System.out.print("[" + count[row][column] + "]");
            }
            System.out.println("");
        }
    }
    public boolean isFull () {
        for (int row = 0; row <= count.length - 1; row++) {
            for (int column = 0; column <= count[0].length - 1; column++) {
                if (count[row][column] == ' ') return false;
            }
        }
        return true;
    }
    public int winner () {
        /*
         1 = X won
         2 = O won
         -1 = no winner yet
         */
        //solutions that go through the middle
        if (
           count[0][1] == count[1][1] && count[1][1] == count[2][1] //vertical col 1
        || count[1][0] == count[1][1] && count[1][1] == count[1][2] //horizontal row 1
        || count[0][0] == count[1][1] && count[1][1] == count[2][2] //diagonal top left to bottom right
        || count[0][2] == count[1][1] && count[1][1] == count[2][0] //diagonal top right to bottom left
        ) {
            if (count[1][1] == 'X') return 1;
            else if (count[1][1] == 'O') return 2;
        }
        //solutions that go through the top right corner
        if (
           count[0][0] == count[1][0] && count[1][0] == count[2][0] //vertical column 0
        || count[0][0] == count[0][1] && count[0][1] == count[0][2] //horizontal row 0
        ) {
            if (count[0][0] == 'X') return 1;
            else if (count[0][0] == 'O') return 2;
        }
        //solutions that go through the bottom left corner
        if (
           count[0][2] == count[1][2] && count[1][0] == count[2][2] //vertical col 2
        || count[2][0] == count[2][1] && count[2][1] == count[2][2] //horizontal row 2
        ) {
            if (count [2][2] == 'X') return 1;
            else if (count[2][2] == 'O') return 2;
        }
        return -1;
    }
}
