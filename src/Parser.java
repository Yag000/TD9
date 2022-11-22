import java.util.Scanner;

public class Parser {

    Scanner sc;

    Parser(Scanner sc) {
        this.sc = sc;
    }

    Parser() {
        this.sc = new Scanner(System.in);
    }

    public String[] parseInput() throws IllegalArgumentException {
        String nextString = sc.nextLine();

        String[] splitString = nextString.split(" ");

        switch (splitString[0].toUpperCase()) {
            case "SHOOT":
                if (splitString.length != 2)
                    throw new IllegalArgumentException();
                if (splitString[1].toUpperCase().matches("^[A-J]([1-9]|10)$"))
                    return new String[] { splitString[0].toUpperCase(), splitString[1].toUpperCase() };
                else
                    throw new IllegalArgumentException();

            default:
                throw new IllegalArgumentException();
        }

    }

}
