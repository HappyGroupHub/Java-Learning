package com.gmail.chiyc88.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 5 numbers: ");
        int[] input = new int[5];
        for (int i = 0; i <=4; i++) {
            input[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<= 4; i++) {
            sum = sum + input[i];
        }
        int avg = sum / input.length;

        double[] sbCal = new double[5];
        double sb = 0;
        for (int i = 0; i <= 4; i++) {
            sbCal[i] = Math.pow(input[i] - avg, 2) / 5;
            sb = sb + sbCal[i];
        }
        sb = Math.sqrt(sb);
        double[] zScore = new double[5];
        for (int i = 0; i <= 4; i++) {
            zScore[i] = (input[i] - avg) / sb;
            System.out.print(zScore[i] + ", ");
        }
    }
}