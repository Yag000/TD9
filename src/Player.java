public class Player {
    private String name;

    private Board selfGrid;
    private Board attackGrid;

    public Player(String name) {
        this.name = name;
    }

    public Board getSelfGrid() {
        return selfGrid;
    }

    public void setAttackGrid(Board attackGrid) {
        this.attackGrid = attackGrid;
    }

    public void affiche() {
        selfGrid.printSelf();
        attackGrid.printAttack();
    }
}