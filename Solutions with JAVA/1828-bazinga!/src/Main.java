import java.io.IOException;
import java.util.Scanner;

class Game {

    static String rockPaperScissorsLizardSpock (String sheldon, String raj) {
        String result = "asd";
        if ( sheldon.equals(raj) ) {
            result = "De novo!";
        } else
        if ( sheldon.equals("tesoura") && raj.equals("papel") ||
            sheldon.equals("papel") && raj.equals("pedra") ||
            sheldon.equals("pedra") && raj.equals("lagarto") ||
            sheldon.equals("lagarto") && raj.equals("Spock") ||
            sheldon.equals("Spock") && raj.equals("tesoura") ||
            sheldon.equals("tesoura") && raj.equals("lagarto") ||
            sheldon.equals("lagarto") && raj.equals("papel") ||
            sheldon.equals("papel") && raj.equals("Spock") ||
            sheldon.equals("Spock") && raj.equals("pedra") ||
            sheldon.equals("pedra") && raj.equals("tesoura")
        ) {
            result = "Bazinga!";
        } else {
            result = "Raj trapaceou!";
        }
        return result;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        while ( counter < t + 1 ) {
            String[] input = scanner.nextLine().split("\\s+");
            String sheildonChoice = input[0];
            String rajChoice = input[1];
            String result;
            result = Game.rockPaperScissorsLizardSpock(sheildonChoice, rajChoice);
            System.out.println("Caso #" + counter + ": " + result);
            counter++;
        }
    }
}