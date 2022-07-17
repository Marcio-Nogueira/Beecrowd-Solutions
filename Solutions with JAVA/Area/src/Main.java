import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String[] entrada = input.nextLine().split("\\s+");
        double a = Double.parseDouble(entrada[0]);
        double b = Double.parseDouble(entrada[1]);
        double c = Double.parseDouble(entrada[2]);

        double areaTriangulo = (a * c)/2;
        double areaCirculo = 3.14159 * c * c;
        double areaTrapezio = ((a + b) * c)/2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

    }

}