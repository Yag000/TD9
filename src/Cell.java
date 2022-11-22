public class Cell {

    int x, y; // Cell coordinates
    Boat boat; // The boat
    int part; // Which part of the boat

    public Cell(int x, int y, Boat boat, int part) {
        this.x = x;
        this.y = y;
        this.boat = boat;
        this.part = part;
    }

    public Cell(int x, int y) {
        this(x, y, null, -1);
    }

}
