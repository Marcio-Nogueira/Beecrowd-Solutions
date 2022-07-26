import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;


public class Main {

    public static void main(String[] args) throws IOException {

      Scanner scanner = new Scanner(System.in);
      String[] input = scanner.nextLine().split("\\s+");
      float a = Float.parseFloat(input[0]);
      float b = Float.parseFloat(input[1]);
      int q;
      int r;
      if (a < 0 && b > 0) {
          q = (int) Math.floor(a / b);
          r = (int) (a - q * b);
      } else if (a < 0 && b < 0) {
          q = (int) Math.ceil(abs(a / b));
          r = (int) Math.ceil(abs(a - q * b));
      }
      else {
          q = (int) (a / b);
          r = (int) (a % b);
      }
        System.out.printf("%d %d\n", q, r);

    }

}
