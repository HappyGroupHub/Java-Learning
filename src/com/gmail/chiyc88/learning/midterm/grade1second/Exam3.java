package com.gmail.chiyc88.learning.midterm.grade1second;

public class Exam3 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 4, 1, 6, 1, 6, 2, 1, 3, 5};
        int counter[] = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter[nums[i] -1]++;
            } else if (nums[i] == 2) {
                counter[nums[i] -1]++;
            } else if (nums[i] == 3) {
                counter[nums[i] -1]++;
            } else if (nums[i] == 4) {
                counter[nums[i] -1]++;
            } else if (nums[i] == 5) {
                counter[nums[i] -1]++;
            } else if (nums[i] == 6) {
                counter[nums[i] -1]++;
            }
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " is " + counter[i - 1] + " times.");
        }
    }
}
