import java.security.cert.LDAPCertStoreParameters;
import java.util.HashSet;
import java.util.Set;

import javax.security.auth.kerberos.KeyTab;

import boat.Boat;

/**
 * Board
 */
public class Board {

    Cell[][] board;

    enum Orientation {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    public Board() {
        board = new Cell[10][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new Cell(i, j);
            }
        }
    }

    public boolean placeBoat(int x, int y, Boat b, Orientation o) {
        if (getCell(x, y).hasBoat())
            return false;

        return true;

    }

    public Cell getCell(int x, int y) {
        return board[x][y];
    }

    public Boat getBoat(int x, int y) {
        return getCell(x, y).getBoat();
    }

    public void shootCell(int x, int y) {
        // TODO: Check if shootable
        getCell(x, y).shoot();
    }

    /**
     * Checks if all the Boats have been sunk
     * 
     * @return true if all the Boats have been sunk;
     *         false otherwise
     */
    public boolean allSunk() {

        for (Boat boat : getAllBoats()) {
            if (!boat.isSunk())
                return false;
        }

        return true;
    }

    /**
     * Gets all the Boats on the Board
     *
     * @return A Set containing all tne Board's Boats
     */
    public Set<Boat> getAllBoats() {

        Set<Boat> res = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (getCell(i, j).hasBoat())
                    res.add(getBoat(i, j));
            }
        }

        return res;

    }

    public void show() {
        String rowName = "ABCDEFGHIJ";
        int colName = 1;
        String lineDelimiter = "-".repeat(23);
        int rowIdx = 0;

        System.out.print("   ");
        for (int i = 1; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println(lineDelimiter);

        for (Cell[] row : board) {
            System.out.print(rowName.charAt(rowIdx) + " |");

            for (Cell col : row) {
                System.out.print(col.getBoat() + " ");
                rowIdx++;

            }
            System.out.println(lineDelimiter);
        }
    }

}