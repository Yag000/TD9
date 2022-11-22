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

    public Board getAttackGrid() {
        return attackGrid;
    }

    public void setAttackGrid(Board attackGrid) {
        this.attackGrid = attackGrid;
    }

    public void attack(int x, int y) {

    }

    public boolean haveWin() {
        if (attackGrid.allDestroy()) {
            System.out.println(name + " a gagné !");
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(name + "\n");
        selfGrid.printSelf();
        attackGrid.printAttack();
    }
}