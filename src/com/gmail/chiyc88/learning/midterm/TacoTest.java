package com.gmail.chiyc88.learning.midterm;

import java.util.Scanner;

public class TacoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
        int numberTemp = number;
        for (int i = numberTemp + 1; i >= 1; i--) {
            numberTemp = numberTemp - 1;
            if (numberTemp != number - 1) {
                System.out.println("");
            }
            for (int j = numberTemp + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
        }
        numberTemp = 1;
        for (int i = 2; i <= number; i++) {
            if (numberTemp != 1) {
                System.out.println();
            }
            numberTemp ++;
            for (int j = numberTemp ; j >= 1; j--) {
                System.out.print(j + " ");
            }
        }
    }
}
