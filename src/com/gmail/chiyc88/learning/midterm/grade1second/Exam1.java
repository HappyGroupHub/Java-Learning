package com.gmail.chiyc88.learning.midterm.grade1second;

public class Exam1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != 2) {
                    System.out.print("*");
                } else {
                    if (j != 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
