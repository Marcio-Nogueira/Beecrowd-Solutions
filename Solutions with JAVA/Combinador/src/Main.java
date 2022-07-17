import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String l = input.nextLine();
        int n = Integer.parseInt(l);
        int contador = 0;

        while (contador < n) {

            String linha = input.nextLine();
            String[] linhaComposta = linha.split("\\s+");
            String linha1 = linhaComposta[0];
            String linha2 = linhaComposta[1];
            String resultado = "";

            int menorTamanho = linha1.length();
            if (menorTamanho > linha2.length()) {
                menorTamanho = linha2.length();
            }

            for (int i = 0; i < menorTamanho; i++) {
                resultado += linha1.charAt(i);
                resultado += linha2.charAt(i);
            }
            if (linha1.length() > linha2.length()) {
                resultado += linha1.substring(menorTamanho);
            } else if (linha2.length() > linha1.length()) {
                resultado += linha2.substring(menorTamanho);
            }

            if (resultado != "") {
                System.out.println(resultado);
                contador++;
            }
        }
    }

}

