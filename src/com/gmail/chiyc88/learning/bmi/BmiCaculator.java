package com.gmail.chiyc88.learning.bmi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Please enter your height(cm) : ");
        float heightCm = scanner.nextFloat();
        System.out.print("Please enter your weight(kg) : ");
        float weight = scanner.nextFloat();
        float heightM = heightCm / 100;
        float bmi = (float) (weight / Math.pow(heightM, 2));
        System.out.println("Your BMI is : " + df.format(bmi));
        if (bmi < 18.5) {
            System.out.println("You are underweight!");
        } else if (bmi > 24) {
            System.out.println("You are overweight!");
        } else {
            System.out.println("Your weight is within the normal range");
        }
    }
}