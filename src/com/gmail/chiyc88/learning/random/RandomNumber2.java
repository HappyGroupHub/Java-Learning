package com.gmail.chiyc88.learning.random;

import java.util.Random;

public class RandomNumber2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[4];
        boolean[] m = new boolean[10];
        for(boolean b : m){
            b = false;
        }
        int i = 0;
        while (i < 4) {
            int rand = random.nextInt(9 - 1);
            while (m[rand]) {
                rand = random.nextInt(9 - 1);
            }
            numbers[i++] = rand;
            m[rand] = true;
        }

        for(int k : numbers){
            System.out.println(k);
        }
    }
}