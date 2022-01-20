package com.gmail.chiyc88.learning;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 5000; i++) {
            int one = random.nextInt(6 - 1);
            int two = random.nextInt(6 - 1);
            if ((one == 1 && two == 2) || one == 2 && two == 1) {
                count += 1;
            }
        }
        double prob = count / 5000D;
        System.out.println("次數: " + count);
        System.out.println("機率: " + prob);
    }
}