import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        float x = Float.parseFloat(input[0]);
        float y = Float.parseFloat(input[1]);
        if ( x == 0 && y == 0 ) {
            System.out.println("Origem");
        } else if ( x > 0 && y > 0 ) {
            System.out.println("Q1");
        } else if ( x < 0 && y > 0 ) {
            System.out.println("Q2");
        } else if ( x < 0 && y < 0 ) {
            System.out.println("Q3");
        } else if( x > 0 && y < 0 ) {
            System.out.println("Q4");
        } else if ( x == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Eixo X");
        }
    }
}
