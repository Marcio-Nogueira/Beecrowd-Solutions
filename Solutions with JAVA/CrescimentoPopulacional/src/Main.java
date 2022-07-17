import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

       Scanner input = new Scanner(System.in);
       int t = Integer.parseInt(input.nextLine());
       int contador = 0;

       while (contador < t) {
       String[] entrada = input.nextLine().split("\\s+");
       int pa = Integer.parseInt(entrada[0]);
       int pb = Integer.parseInt(entrada[1]);
       float g1 = Float.parseFloat(entrada[2]);
       float g2 = Float.parseFloat(entrada[3]);
       int anos = 0;
       int paEmCemAnos = (int) (pa * Math.pow(1 + (g1 / 100), 100));
       int pbEmCemAnos = (int) (pb * Math.pow(1 + (g2 / 100), 100));

           if (paEmCemAnos < pbEmCemAnos) {
               System.out.println("Mais de 1 seculo.");
           } else {
               while (pa <= pb) {
                   pa += (int) (pa * (g1 / 100));
                   pb += (int) (pb * (g2 / 100));
                   anos++;
               }
               System.out.println(anos + " anos.");
           }
           contador++;
       }
    }
}