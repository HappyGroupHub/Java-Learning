package com.gmail.chiyc88.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 8; i <= 2; i -= 2) {
            for (int j = 0; j <= i; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
