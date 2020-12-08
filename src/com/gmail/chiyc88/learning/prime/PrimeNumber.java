package com.gmail.chiyc88.learning.prime;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        long input = scanner.nextLong();
        boolean isPrime = checkPrime(input);
        if (isPrime == true) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
    }
    public static boolean checkPrime(long input) {
        boolean isPrime = true;
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                System.out.println(input + " / " + i + " = " + input / i);
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
