package com.gmail.chiyc88.learning.random;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[4];
        int i = 0;
        while (i < 4) {
            numbers[i] = random.nextInt(9 - 1);
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    numbers[i] = random.nextInt(9 - 1);
                    j = -1;
                }
            }
            System.out.print(numbers[i]);
            i++;
        }
    }
}