import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float valor = input.nextFloat();
        System.out.printf("NOTAS:\n");
        int notas = 0;

        if (valor >= 100) {
            notas = (int) (valor/100);
            valor = valor - (notas * 100);
        }
        System.out.printf("%d nota(s) de R$ 100.00\n", notas);
        notas = 0;

        if (valor >= 50) {
            notas = (int) (valor/50);
            valor = valor - (notas * 50);
        }
        System.out.printf("%d nota(s) de R$ 50.00\n", notas);
        notas = 0;

        if (valor >= 20) {
            notas = (int) (valor/20);
            valor = valor - (notas * 20);
        }
        System.out.printf("%d nota(s) de R$ 20.00\n", notas);
        notas = 0;

        if (valor >= 10) {
            notas = (int) (valor/10);
            valor = valor - (notas * 10);
        }
        System.out.printf("%d nota(s) de R$ 10.00\n", notas);
        notas = 0;

        if (valor >= 5) {
            notas = (int) (valor/5);
            valor = valor - (notas * 5);
        }
        System.out.printf("%d nota(s) de R$ 5.00\n", notas);
        notas = 0;

        if (valor >= 2) {
            notas = (int) (valor/2);
            valor = valor - (notas * 2);
        }
        System.out.printf("%d nota(s) de R$ 2.00\n", notas);
        notas = 0;

        System.out.printf("MOEDAS:\n");
        if (valor >= 1) {
            notas = (int) (valor/1);
            valor = valor - (notas * 1);
        }
        System.out.printf("%d moeda(s) de R$ 1.00\n", notas);
        notas = 0;

        if (valor >= 0.5) {
            notas = (int) (valor/0.5);
            valor = (float) (valor - (notas * 0.5));
        }
        System.out.printf("%d moeda(s) de R$ 0.50\n", notas);
        notas = 0;

        if (valor >= 0.25) {
            notas = (int) (valor/0.25);
            valor = (float) (valor - (notas * 0.25));
        }
        System.out.printf("%d moeda(s) de R$ 0.25\n", notas);
        notas = 0;

        if (valor >= 0.1) {
            notas = (int) (valor/0.1);
            valor = (float) (valor - (notas * 0.1));
        }
        System.out.printf("%d moeda(s) de R$ 0.10\n", notas);
        notas = 0;

        if (valor >= 0.05) {
            notas = (int) (valor/0.05);
            valor = (float) (valor - (notas * 0.05));
        }
        System.out.printf("%d moeda(s) de R$ 0.05\n", notas);
        notas = 0;

        if (valor > 0) {
            valor = (int) Math.round(valor*100);
            notas = (int) valor;
        }
        System.out.printf("%d moeda(s) de R$ 0.01\n",  notas);

    }
}
