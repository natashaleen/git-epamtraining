package fundamentals;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int a, b, sum, multiplicationResult;
        System. out. println("Введите число а");
        a = num.nextInt();
        System. out. println("Введите число в");
        b = num.nextInt();
        sum = a + b;
        multiplicationResult =a * b;
        System. out. println("Результат сложения "+ a + " + " + b +" = " + sum);
        System. out. println("Результат умножения "+ a + " * " + b +" = " + multiplicationResult);
    }

}