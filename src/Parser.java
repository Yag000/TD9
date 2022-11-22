import java.util.Scanner;

public class Parser {

    private final String regex = "^[A-J]([1-9]|10)$";

    Scanner sc;

    Parser(Scanner sc) {
        this.sc = sc;
    }

    Parser() {
        this.sc = new Scanner(System.in);
    }

    public Board.Orientation stringToOrientation(String s) {
        switch (s.toUpperCase()) {
            case "N":
            case "NORTH":
                return Board.Orientation.NORTH;

            case "EAST":
            case "E":
                return Board.Orientation.EAST;

            case "S":
            case "SOUTH":
                return Board.Orientation.SOUTH;

            case "W":
            case "WEST":
                return Board.Orientation.WEST;

            default:
                return null;
        }

    }

    public String[] parseInput() throws IllegalArgumentException {
        String nextString = sc.nextLine();

        if (nextString.toUpperCase().matches(regex))
            return new String[] { "SHOOT", nextString.toUpperCase() };

        String[] splitString = nextString.split(" ");

        switch (splitString[0].toUpperCase()) {

            case "SHOOT":
                if (splitString.length != 2)
                    throw new IllegalArgumentException("Invalid number of arguments");
                if (splitString[1].toUpperCase().matches(regex))
                    return new String[] { splitString[0].toUpperCase(), splitString[1].toUpperCase() };
                else
                    throw new IllegalArgumentException("Invalid coordinates");

            case "PLACE":
                if (splitString.length != 3)
                    throw new IllegalAccessError("Invalid number of arguments");
                if (!splitString[1].matches(regex))
                    throw new IllegalArgumentException("Invalid coordinates");

                if (stringToOrientation(splitString[2]) == null)
                    throw new IllegalArgumentException("Invalid orientation");

                return new String[] { "PLACE", splitString[1].toUpperCase(),
                        stringToOrientation(splitString[2]).toString() };

            default:
                throw new IllegalArgumentException("Invalid command");
        }

    }

}
