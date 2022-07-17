import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        int notas = 0;

        System.out.printf("%d\n", valor);
        if (valor >= 100) {
            notas = valor/100;
            valor = valor - (notas * 100);
        }
        System.out.printf("%d nota(s) de R$ 100,00\n", notas);
        notas = 0;

        if (valor >= 50) {
            notas = valor/50;
            valor =  valor - (notas * 50);
        }
        System.out.printf("%d nota(s) de R$ 50,00\n", notas);
        notas = 0;

        if (valor >= 20) {
            notas = valor/20;
            valor =  valor - (notas * 20);
        }
        System.out.printf("%d nota(s) de R$ 20,00\n", notas);
        notas = 0;

        if (valor >= 10) {
            notas = valor/10;
            valor =  valor - (notas * 10);
        }
        System.out.printf("%d nota(s) de R$ 10,00\n", notas);
        notas = 0;

        if (valor >= 5) {
            notas = valor/5;
            valor =  valor - (notas * 5);
        }
        System.out.printf("%d nota(s) de R$ 5,00\n", notas);
        notas = 0;

        if (valor >= 2) {
            notas = valor/2;
            valor =  valor - (notas * 2);
        }
        System.out.printf("%d nota(s) de R$ 2,00\n", notas);
        notas = 0;

        if (valor >= 1) {
            notas = valor/1;
            valor =  valor - (notas * 1);
        }
        System.out.printf("%d nota(s) de R$ 1,00\n", notas);

    }
}
