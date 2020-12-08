package com.gmail.chiyc88.learning.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        boolean divided3and5 = number % 3 == 0 && number % 5 == 0;
        boolean divided5 = number % 5 == 0;
        boolean divided3 = number % 3 == 0;
        if (divided3and5 == true) {
            System.out.println("FizzBuzz");
        } else if (divided5 == true) {
            System.out.println("Fizz");
        } else if (divided3 == true) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}