package com.company;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int a, b, result1, result2;
        System. out. println("Введите число а");
        a = num.nextInt();
        System. out. println("Введите число в");
        b = num.nextInt();
        result1= a + b;
        result2 =a * b;
        System. out. println("Результат сложения "+ a + " + " + b +" = " + result1);
        System. out. println("Результат умножения "+ a + " * " + b +" = " + result2);
    }

}
