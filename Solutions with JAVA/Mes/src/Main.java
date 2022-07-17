import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

class Meses {
    public int id;
    public String name;
    Meses(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println(name);
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        Meses[] array = new Meses[] {
                new Meses(1,"January"),
                new Meses(2,"February"),
                new Meses(3,"March"),
                new Meses(4,"April"),
                new Meses(5,"May"),
                new Meses(6,"June"),
                new Meses(7,"July"),
                new Meses(8, "August"),
                new Meses(9, "September"),
                new Meses(10,"October"),
                new Meses(11,"November"),
                new Meses(12,"December")
        };

        Scanner input = new Scanner(System.in);
        int mes;
        do {
            mes = input.nextInt();
        } while(mes>12 || mes<1);
        array[mes-1].display();

    }

}
