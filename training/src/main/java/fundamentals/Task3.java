package fundamentals;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 250;
        int c;
        System.out.println("Задайте колличество чисел");
        Scanner scanner = new Scanner(System.in);
        c= scanner.nextInt();

        for (int i = 0; i < c; i++) {
            int random_number1 = a + (int) (Math.random() * b);

            System.out.print(" " + random_number1);
        }
    }
}


