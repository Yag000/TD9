import boat.Boat;

public class Cell {

    int x, y; // Cell coordinates
    Boat boat; // The boat
    Integer part; // Which part of the boat

    public Cell(int x, int y, Boat boat, Integer part) {
        this.x = x;
        this.y = y;
        this.boat = boat;
        this.part = part;
    }

    public Cell(int x, int y) {
        this(x, y, null, null);
    }

    public Boat getBoat() {
        return boat;
    }

    public void shoot() {
        boat.hitAt(part);
    }

}
