import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        double entrada = input.nextDouble();

        double n = 3.14159;

        double area = n * entrada * entrada;

        System.out.printf("A=%.4f\n", area);

    }

}