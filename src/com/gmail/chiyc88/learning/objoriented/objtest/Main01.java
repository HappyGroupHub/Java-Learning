package com.gmail.chiyc88.learning.objoriented.objtest;

public class Main01 {
    public static void main(String[] args) {
        Score score = new Score(3, 4, 2);
        int sum = score.addUp(40, 80, 60);
        System.out.println(sum);
    }
}
