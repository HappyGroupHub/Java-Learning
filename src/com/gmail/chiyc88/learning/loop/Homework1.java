package com.gmail.chiyc88.learning.loop;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number (2-9) : ");
        int input = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            int sum = input * i;
            if (sum < 10) {
                System.out.println(input + "*" + i + "= " + sum);
            } else {
                System.out.println(input + "*" + i + "=" + sum);
            }
        }
    }
}