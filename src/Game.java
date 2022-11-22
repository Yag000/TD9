public class Game {
    private Player p1;
    private Player p2;

    public Game() {
        p1 = new Player("p1");
        p2 = new Player("p2");
        p1.setAttackGrid(p2.getSelfGrid());
        p2.setAttackGrid(p1.getSelfGrid());
    }
}
