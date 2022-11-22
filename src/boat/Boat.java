package boat;

public abstract class Boat {
    protected int size;

    protected boolean[] hit;

    protected Boat(int size) {
        this.size = size;
        this.hit = new boolean[size];
    }

    /**
     * Returns true if the boat is sunk, false otherwise.
     * 
     * @return true if the boat is sunk, false otherwise.
     */
    public boolean isSunk() {
        for (boolean b : hit) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if the boat is hit at the given position, false otherwise.
     * 
     * @param position
     *                 the position to check.
     * @return true if the boat is hit at the given position, false otherwise.
     */
    public boolean isHit(int position) {
        return hit[position];
    }

    /**
     * The boat is hit at the given position.
     * 
     * @param position the position to hit.
     */
    public void hitAt(int position) {
        hit[position] = true;
    }
}
