import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
         do {
            String[] input = scanner.nextLine().split("\\s+");
            m = Integer.parseInt(input[0]);
            n = Integer.parseInt(input[1]);
            int bigger;
            int smaller;
            int sum = 0;
            if (m <= 0 || n <= 0) {
                System.exit(0);
            }
            if (m > n) {
                bigger = m;
                smaller = n;
            } else {
                bigger = n;
                smaller = m;
            }
            for (int i = smaller; i <= bigger; i++) {
                System.out.printf("%d ", i);
                sum += i;
            }
             System.out.printf("Sum=%d\n", sum);


        } while (m > 0 || n > 0);
    }

}