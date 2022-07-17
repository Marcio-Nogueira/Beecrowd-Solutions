import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String[] entrada = input.nextLine().split("\\s+");
        float n1 = Float.parseFloat(entrada[0]);
        float n2 = Float.parseFloat(entrada[1]);
        float n3 = Float.parseFloat(entrada[2]);
        float n4 = Float.parseFloat(entrada[3]);
        float media = (float) (n1 * 0.2 + n2 * 0.3 + n3 * 0.4 + n4 * 0.1);

        float mediaFinal = 0;

        if (media >= 5 && media < 7) {
            float exame = Float.parseFloat(input.nextLine());
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno em exame.\n");
            System.out.printf("Nota do exame: %.1f\n", exame);
            mediaFinal = (media + exame)/2;
        } else {
            System.out.printf("Media: %.1f\n", media);
        }
        if (mediaFinal >= 5 || media >= 7) {
            System.out.printf("Aluno aprovado.\n");
        } else {
            System.out.printf("Aluno reprovado.\n");
        }
        if (mediaFinal >= 5) {
            System.out.printf("Media final: %.1f", mediaFinal);
        }

    }

}