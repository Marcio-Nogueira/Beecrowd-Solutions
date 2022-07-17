import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] combustivel = new int[3];
        int opcao;

        do {
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
                case 1:
                    combustivel[0] +=1;
                    break;
                case 2:
                    combustivel[1] +=1;
                    break;
                case 3:
                    combustivel[2] +=1;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + combustivel[0]);
                    System.out.println("Gasolina: " + combustivel[1]);
                    System.out.println("Diesel: " + combustivel[2]);
                    break;
                default:
                    break;
            }
        } while (opcao!=4);

    }

}