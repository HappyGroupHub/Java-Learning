package com.gmail.chiyc88.learning.guess;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        int i = 1;
        do {
            int sum = num * i;
            System.out.println(num + " x " + i + " = " + sum);
            i++;
        } while (i <= 9);
    }
}
