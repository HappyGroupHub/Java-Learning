package com.gmail.chiyc88.learning.midterm.grade1second;

public class Exam2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                int sum = j * i;
                if (sum < 10) {
                    System.out.print(j + "*" + i + "= " + sum + "    ");
                } else {
                    System.out.print(j + "*" + i + "=" + sum + "    ");
                }
            }
            System.out.println();
        }
    }
}
