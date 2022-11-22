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

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

            }

        }

    }

}