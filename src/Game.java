public class Game {
    private Player p1;
    private Player p2;

    public Game() {
        p1 = new Player("p1");
        p2 = new Player("p2");
        p1.setAttackGrid(p2.getSelfGrid());
        p2.setAttackGrid(p1.getSelfGrid());
    }

    public void tourPlayer(Player p) {
        String[] command;
        do {
            System.out.println("Ou voulez vous attaquer (a A1)");
            try {
                command = Parseur.parseInput();
                int x = ((int) command[1].charAt(0)) - ((int) 'A');
                int y = Integer.valueOf(command[1].charAt(1));

                if (!p.getAttackGrid().isAlreadyShooted(x, y)) {
                    p.attack(x, y);
                    return;
                }
                System.out.println("Cette case a déjà été touchée.");
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        } while (true);
    }

    public void partie(){
        boolean gagner = false;

        do{
            tourPlayer(p1);
            gagner = p1.haveWin();

            if(!gagner){
                tourPlayer(p2);
                gagner = p1.haveWin();
            }
        }

        return;
    }
}
