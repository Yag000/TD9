import java.util.EnumSet;

import boat.Boat;

public class Cell {

    private int x, y; // Cell coordinates
    private Boat boat; // The boat
    private Integer part; // Which part of the boat

    public Cell(int x, int y, Boat boat, Integer part) {
        this.x = x;
        this.y = y;
        this.boat = boat;
        this.part = part;
    }

    public Cell(int x, int y) {
        this(x, y, null, null);
    }

    // Getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Boat getBoat() {
        return boat;
    }

    public Integer getPart() {
        return part;
    }

    // Setters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    // Methods

    public boolean hasBoat() {
        return boat != null;
    }

    public void shoot() {
        boat.hitAt(part);
    }

    @Override
    public String toString() {
        if (hasBoat())
            return "#";
        return " ";
    }
}
