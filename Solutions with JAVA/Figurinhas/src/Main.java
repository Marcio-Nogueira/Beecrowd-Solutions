import java.io.IOException;
import java.util.Scanner;

class MDC{
    static int mdc (int num1, int num2) {
        int maior;
        int menor;
        int aux;
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

            int resto = maior % menor;
            if (resto == 0) {
                return menor;
            } else {
                while (resto != 0) {
                    aux = resto;
                    resto = menor % resto;
                    menor = aux;
                }
                return menor;
            }
        }
    }


public class Main{

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int contador = 0;

        while (contador < n) {

            MDC mdc = new MDC();

            int f1 = input.nextInt();
            int f2 = input.nextInt();

            int tamanhoPilhas = MDC.mdc(f1, f2);
            System.out.println(tamanhoPilhas);

            contador++;
        }
    }
}