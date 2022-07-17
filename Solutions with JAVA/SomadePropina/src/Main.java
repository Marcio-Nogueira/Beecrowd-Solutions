import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

//        String linhaUm = "11#$%11111*&¨1111&*(1198-=&8789.\"34\"8";
//        String linhaDois = "%(&567.22%99";
        String linhaUm = input.nextLine();
        String linhaDois = input.nextLine();
        String numerosLinhaUm = " ";
        String numerosLinhaDois = " ";

        List<String> caracteresValidos = List.of(
                "0", "1", "2",
                "3", "4", "5",
                "6", "7", "8",
                "9");
        List<String> caracterUnico = List.of(
                "."
        );
        int contadorCaracterUnico = 0;

        for (int i = 0; i < linhaUm.length(); i++) {
            if (caracteresValidos.contains(String.valueOf(linhaUm.charAt(i)))) {
                numerosLinhaUm += linhaUm.charAt(i);
            }
            if (caracterUnico.contains(String.valueOf(linhaUm.charAt(i))) && contadorCaracterUnico == 0) {
                numerosLinhaUm += linhaUm.charAt(i);
                contadorCaracterUnico += 1;
            }
        }
        contadorCaracterUnico = 0;

        for (int i = 0; i < linhaDois.length(); i++) {
            if (caracteresValidos.contains(String.valueOf(linhaDois.charAt(i)))) {
                numerosLinhaDois += linhaDois.charAt(i);
            }
            if (caracterUnico.contains(String.valueOf(linhaDois.charAt(i))) && contadorCaracterUnico == 0) {
                numerosLinhaDois += linhaDois.charAt(i);
                contadorCaracterUnico += 1;
            }
        }
        String CPF = numerosLinhaUm.substring(0, 12);

        String numerosLinhaUmFinal = numerosLinhaUm.substring(12);
        int tamanhoLinhaum = numerosLinhaUmFinal.length();
        int tamanhoLinhaDois = numerosLinhaDois.length();

        if (tamanhoLinhaum > 17) {
            for (int i = tamanhoLinhaum; i > 17; i--) {
                numerosLinhaUmFinal = numerosLinhaUmFinal.substring(0, numerosLinhaUmFinal.length() - 1);
            }
        }
        if (tamanhoLinhaDois > 17) {
            for (int i = tamanhoLinhaDois; i > 17; i--) {
                numerosLinhaDois = numerosLinhaDois.substring(0, numerosLinhaDois.length() - 1);
            }
        }

        final DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);

        double valorUm = Double.parseDouble(numerosLinhaUmFinal);
        double valorDois = Double.parseDouble(numerosLinhaDois);

        BigDecimal bd = BigDecimal.valueOf(valorUm);
        bd = bd.setScale(2, RoundingMode.FLOOR);

        BigDecimal bd2 = BigDecimal.valueOf(valorDois);
        bd2 = bd2.setScale(2, RoundingMode.FLOOR);

        double valorUmFormatado = bd.doubleValue();
        double valorDoisFormatado = bd2.doubleValue();

        double resultado = valorUmFormatado + valorDoisFormatado;

        System.out.println("cpf" + CPF);

        System.out.println(df.format(resultado));

    }

}
