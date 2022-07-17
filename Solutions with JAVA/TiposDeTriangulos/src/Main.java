import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

       Scanner input = new Scanner(System.in);
       String[] entrada = input.nextLine().split("\\s+");
       float a = Float.parseFloat(entrada[0]);
       float b = Float.parseFloat(entrada[1]);
       float c = Float.parseFloat(entrada[2]);
       float aux = 0;

       if (b > a) {
           aux = a;
           a = b;
           b = aux;
       }
       if (c > a) {
           aux = a;
           a = c;
           c = aux;
       }
       if (c > b) {
           aux = b;
           b = c;
           c = aux;
       }

       if ( a >= (b + c)) {
           System.out.println("NAO FORMA TRIANGULO");
       } else {
           if ((a * a) == ((b * b) + (c * c))) {
               System.out.println("TRIANGULO RETANGULO");
           }
           if ((a * a) > ((b * b) + (c * c))) {
               System.out.println("TRIANGULO OBTUSANGULO");
           }
           if ((a * a) < ((b * b) + (c * c))) {
               System.out.println("TRIANGULO ACUTANGULO");
           }
           if (a == b && a == c) {
               System.out.println("TRIANGULO EQUILATERO");
           } else if (a == b || a == c || b == c) {
               System.out.println("TRIANGULO ISOSCELES");
           }
       }

    }

}