import java.io.IOException;
import java.util.ArrayList;
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

        while(n !=0) {

            if (n == 0) {
                System.exit(0);
            }

            ArrayList lista = new ArrayList<Integer>();
            String linha2 = input.nextLine();
            String[] strings = new String[n + 2];
            strings = linha2.split("\\s+");

            for (int i = 0; i < n; i++) {
                lista.add(Integer.parseInt(strings[i]));
            }
            lista.add(Integer.parseInt(strings[0]));
            lista.add(Integer.parseInt(strings[1]));
            Integer[] valores = (Integer[]) lista.toArray(new Integer[0]);

            int picos = 0;
            for (int i = 1; i < n + 1; i++) {
                if (valores[i] < valores[i - 1] && valores[i] < valores[i + 1]) {
                    picos += 1;
                } else if (valores[i] > valores[i - 1] && valores[i] > valores[i + 1]) {
                    picos += 1;
                }
            }
            System.out.println(picos);
            n = Integer.parseInt(input.nextLine());
        }
    }
}


