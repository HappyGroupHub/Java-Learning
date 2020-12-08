package com.gmail.chiyc88.learning.midterm;

import java.util.Scanner;

public class MidtermExam {
    public static void main(String[] args) {
        int sum = 0, remaining = 0;
        int a = 10, b = 15, c = 23;
        int ten = 0, five = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please insert coin: ");
            String insert = scanner.next();
            if (insert.startsWith("a")) {
                buy(sum, a);
            } else if (insert.startsWith("b")) {
                buy(sum, b);
            } else if (insert.startsWith("c")) {
                buy(sum, c);
            } else {
                int insertCoin = Integer.parseInt(insert);
                if (insertCoin == 0) {
                    remaining = sum;
                    if (sum / 10 > 0) {
                        ten = sum / 10;
                        remaining = sum - ten * 10;
                    }
                    if (remaining / 5 > 0) {
                        five = remaining / 5;
                        remaining = remaining - five * 5;
                    }
                    System.out.println("Returning $10: " + ten);
                    System.out.println("Returning $5: " + five);
                    System.out.println("Returning $1: " + remaining);
                    System.out.println("Bye");
                    break;
                } else {
                    sum = sum + insertCoin;
                    System.out.println("Total: " + sum);
                    continue;
                }
            }
        }
    }

    public static void buy(int m, int price) {
        if (m >= price) {
            m = m - price;
            System.out.println("Bon! Total: " + m);
        } else {
            System.out.println("Beep! Total: " + m);
        }
    }

}

//大一程設期中考