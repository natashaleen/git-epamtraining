package com.company;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("What's your name?");
        Scanner str =new Scanner(System.in);
        System.out.println("May the force come with you, " + str.nextLine() + "!");
    }
}
