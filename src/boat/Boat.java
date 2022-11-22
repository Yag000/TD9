package boat;

public abstract class Boat {
    protected int size;

    protected boolean[] hit;

    public Boat(int size) {
        this.size = size;
        this.hit = new boolean[size];
    }
}
