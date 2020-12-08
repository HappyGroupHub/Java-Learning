package com.gmail.chiyc88.learning.loop;

public class Homework2 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= 9 ; j++) {
                int sum = i * j;
                if (sum < 10) {
                    System.out.print(j + "*" + i +"=" + sum + "   ");
                } else  {
                    System.out.print(j + "*" + i +"=" + sum + "  ");
                }
            }
            System.out.println();
        }
    }
}