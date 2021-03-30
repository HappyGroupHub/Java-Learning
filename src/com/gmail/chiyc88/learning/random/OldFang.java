package com.gmail.chiyc88.learning.random;

import java.util.Random;
import java.util.Scanner;

public class OldFang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("起始數值: ");
        int start = scanner.nextInt();
        System.out.print("範圍長度: ");
        int length = scanner.nextInt();
        int end = start + length;
        System.out.print("從中選出幾個數字: ");
        int amount = scanner.nextInt();
        int[] randomNumbers = new int[amount];

        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            randomNumbers[i] = random.nextInt(end - start);
            for (int j = 0; j < i; j++) {
                if (randomNumbers[i] == randomNumbers[j]) {
                    i--;
                }
            }
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
    }
}
