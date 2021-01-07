package com.gmail.chiyc88.learning.sorting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers : ");

        String inputNumbers[] = scanner.nextLine().split(" ");
        //Create a string "inputNumbers[]" by user's inputs

        int numbers[] = new int[inputNumbers.length];
        //Define First outside the loop

        int bigCounter[] = new int[inputNumbers.length];
        //Define First outside the loop
        //bigCounter[] is created to count how many numbers is smaller than one of the number

        int sorted[] = new int[inputNumbers.length];
        //Define First outside the loop
        //sorted[] is the final sorted number array


        //Transform "inputNumbers" to int type with numbers[]
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        //Start comparing numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    //Avoid comparing the same number
                    continue;
                } else {
                    //If number a > b, then that number's bigCounter[] will + 1
                    if (numbers[i] > numbers[j]) {
                        bigCounter[i]++;
                    }
                }
            }
        }
        //Because there will surely has a smallest number
        //And that number's bigCounter[] will be 0
        //And so.. bigCounter[] will have 1 2 3 4 ...
        //From 0 to the end, put number into sorted[]
        for (int i = 0; i < numbers.length; i++) {
            sorted[i] = numbers[findIndex(bigCounter, i)];
        }

        //Print out the result
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    //Because there's no method built in Java to find the index of an array
    //So made one
    public static int findIndex(int arr[], int t) {

        //Check if array is null
        if (arr == null) {
            return -1;
        }

        //Find the length of this array
        int len = arr.length;
        int i = 0;

        //Find the required value and it's index
        while (i < len) {
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        //If error, return -1
        return -1;
    }
}