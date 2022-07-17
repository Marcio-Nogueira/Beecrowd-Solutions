import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String[] linha1 = input.nextLine().split("\\s+");
        int codigo1 = Integer.parseInt(linha1[0]);
        int qtd1 = Integer.parseInt(linha1[1]);
        float valor1 = Float.parseFloat(linha1[2]);

        String[] linha2 = input.nextLine().split("\\s+");
        int codigo2 = Integer.parseInt(linha2[0]);
        int qtd2 = Integer.parseInt(linha2[1]);
        float valor2 = Float.parseFloat(linha2[2]);

        float resultado = qtd1 * valor1 + qtd2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);

    }

}