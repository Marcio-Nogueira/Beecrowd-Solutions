import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {

            List<String> caracteresValidos = List.of(
                    "0", "1", "2",
                    "3", "4", "5",
                    "6", "7", "8",
                    "9");
            String stringCPF = "";

            for (int i = 0; i < linha.length(); i++) {
                if (caracteresValidos.contains(String.valueOf(linha.charAt(i)))) {
                    stringCPF += linha.charAt(i);
                }
            }

            int[] arrayCPF = new int[9];

            for (int i = 0; i < 9; i++) {
                    arrayCPF[i] = Integer.parseInt(stringCPF.substring(i, i + 1));
            }

            Integer verificador1 = Integer.parseInt(stringCPF.substring(9, 10));
            Integer verificador2 = Integer.parseInt(stringCPF.substring(10, 11));
            int soma1 = 0;
            int soma2 = 0;
            int multiplicador = 9;

            for (int i = 0; i < 9; i++) {
                soma1 += arrayCPF[i] * (i+1);
                soma2 += arrayCPF[i] * (multiplicador);
                multiplicador -= 1;
            }

            int b1 = soma1 % 11;
            if (b1 == 10) {
                b1 = 0;
            }

            int b2 = soma2 % 11;
            if (b2 == 10) {
                b2 = 0;
            }

            if (b1 == verificador1 && b2 == verificador2) {
                System.out.println("CPF valido");
            } else {
                System.out.println("CPF invalido");
            }

        }

    }

}
