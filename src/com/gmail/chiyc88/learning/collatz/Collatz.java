package com.gmail.chiyc88.learning.collatz;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a positive number : ");
            long number = scanner.nextLong();
            if (number <= 0 ) {
                continue;
            } else {
                while (true) {
                    if (number == 1) {
                        System.out.println("This is the end.");
                        break;
                    } else if (number % 2 == 1) {
                        long old = number;
                        number = number * 3 + 1;
                        System.out.println(old + " x 3 + 1 = " + number);
                        continue;
                    } else if (number %2 == 0) {
                        long old = number;
                        number = number / 2;
                        System.out.println(old + " / 2 = " + number);
                        continue;
                    }
                }
                break;
            }
        }
    }
}
