package com.gmail.chiyc88.learning;

public class Compute {

    public static double average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}
