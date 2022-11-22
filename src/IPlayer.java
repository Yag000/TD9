public interface IPlayer {

    public Board getSelfGrid();

    public Board getAttackGrid();

    public void setAttackGrid(Board attackGrid);

    public void attack(int x, int y);

    public boolean haveWin();

    public void print();
}
