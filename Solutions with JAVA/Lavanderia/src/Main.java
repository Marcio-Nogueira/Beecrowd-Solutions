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
        String linha1 = input.nextLine();
        int n = Integer.parseInt(linha1);

        String linha2 = input.nextLine();
        String[] valores = linha2.split("\\s+");
        int la = Integer.parseInt(valores[0]);
        int lb = Integer.parseInt(valores[1]);

        String linha3 = input.nextLine();
        String[] valores2 = linha3.split("\\s+");
        int sa = Integer.parseInt(valores2[0]);
        int sb = Integer.parseInt(valores2[1]);

        if (n>=la && n<=lb && n>=sa && n<=sb) {
            System.out.println("possivel");
        } else {
            System.out.println("impossivel");
        }

    }

}
