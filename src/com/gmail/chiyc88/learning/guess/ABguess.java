package com.gmail.chiyc88.learning.guess;

import java.util.Random;
import java.util.Scanner;

public class ABguess {
    public static void main(String[] args) {
        int[] secret = getRandomNumber();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a four digits number : ");
            String input = scanner.next();
            int[] guessNumbers = new int[4];
            for (int i = 0; i < input.length(); i++) {
                guessNumbers[i] = Character.digit(input.charAt(i), 10);
            }
            int A = 0, B = 0;
            for (int i = 0; i < 4; i++) {
                if (guessNumbers[i] == secret[i]) {
                    A++;
                } else {
                    continue;
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (guessNumbers[i] == secret[j]) {
                        B++;
                    } else {
                        continue;
                    }
                }
            }
            B = B - A;
            if (A == 4 && B == 0) {
                System.out.println("You got the right answer!");
                break;
            } else {
                System.out.println(A + "A" + B + "B");
                System.out.println();
                continue;
            }
        }
    }

    public static int[] getRandomNumber() {
        Random random = new Random();
        int[] numbers = new int[4];
        boolean[] haveused = new boolean[10];
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(9 - 0);
            if (haveused[r] == false) {
                numbers[i] = r;
                haveused[r] = true;
            } else {
                i--;
            }
        }
        return numbers;
    }
}

//幾A幾B猜測遊戲