import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] entrada = input.nextLine().split("\\s+");
        int horaInicial = Integer.parseInt(entrada[0]);
        int minutoInicial = Integer.parseInt(entrada[1]);
        int horaFinal = Integer.parseInt(entrada[2]);
        int minutoFinal = Integer.parseInt(entrada[3]);
        int duracaoHoras;
        int duracaoMinutos;

        if (minutoInicial <= minutoFinal) {
            duracaoMinutos = minutoFinal - minutoInicial;
        } else {
            duracaoMinutos = minutoFinal + 60 - minutoInicial;
            horaFinal = horaFinal - 1;
        }
        if (horaInicial <= horaFinal) {
            duracaoHoras = horaFinal - horaInicial;
        } else {
            duracaoHoras = 24 - horaInicial + horaFinal;
        }

        if (duracaoHoras == 0 && duracaoMinutos == 0) {
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoHoras, duracaoMinutos);
        }
    }
}
