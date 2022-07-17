import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int contador = 0;

        while (contador < n) {

            String linha = input.nextLine();

            String alfabeto = "abcdefghijklmnopqrstuvwxyz";

           int[] frequencia = new int[26];

            String lcLinha = linha.toLowerCase(Locale.ROOT);

            for (int i = 0; i < 26; i++) {
                frequencia[i] = 0;
            }
            for (int i = 0; i < lcLinha.length(); i++) {
                for (int j = 0; j < 26; j++) {

                    if (lcLinha.charAt(i) == alfabeto.charAt(j)) {
                        frequencia[j] += 1;
                    }
                }
            }
            int maior = 0;
            for (int i = 0; i < 26; i++) {
                if (frequencia[i] > maior) {
                    maior = frequencia[i];
                }
            }
            if (maior > 0) {
                for (int i = 0; i < 26; i++) {
                    if (frequencia[i] == maior) {
                        System.out.printf(String.valueOf(alfabeto.charAt(i)));
                    }
                }
                System.out.println("");
                contador++;
            }
        }

    }

}
