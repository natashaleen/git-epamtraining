package com.company;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 250; // Конечное значение диапазона - "до"
        int c;
        System.out.println("Задайте колличество чисел");
        Scanner vvod = new Scanner(System.in);
        c= vvod.nextInt();

        for (int i = 0; i < c; i++) {
            int random_number1 = a + (int) (Math.random() * b);
           //в одну строку
            System.out.print(" " + random_number1);
           // с новой строки
           // System.out.println(random_number1);

        }
    }
}


