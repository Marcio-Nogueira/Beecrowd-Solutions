import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        float sum = 0;
        int limit = 0;
        int counter = 0;
        float size = 0;
        while ( counter < 1 ) {
            for (int i = 0; i < 12; i++) {
                float number = Float.parseFloat(scanner.nextLine());
                if (i > limit) {
                    sum += number;
                    size++;
                }
            }
            limit++;
            counter++;
        }
        if ( operation.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if ( operation.equals("M")) {
            System.out.printf("%.1f\n",sum/size);
        }
    }
}