import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int size = input.length();

        if (size > 80) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}