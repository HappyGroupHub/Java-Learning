package com.gmail.chiyc88.learning.guess;

import java.util.Random;
import java.util.Scanner;

public class EzGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(100 - 1); //設定random出來的數字是1~100, 記得括號內設定範圍時, 要大在小
        int big = 100; //先設定big變數, 等他猜下一輪的時候會用到
        int small = 1; //先設定small變數, 等他猜下一輪的時候會用到
        int guessTimes = 1; //記數
        System.out.print("Please enter a number between 1 to 100: "); //第一次猜測鎖死(1-100)
        int input = scanner.nextInt();
        while (secret != input && guessTimes < 5) { //當秘密數字跟你猜的不等於時, 且猜的次數小於五, 就會無限執行
            if (input > secret) { //當你猜的數字大於秘密數字
                big = input; //因為你猜太大了,但是又比100小,所以更新big
                guessTimes += 1; //記數+1
                System.out.println("Wrong. Guess Smaller");
                System.out.print("Please enter a number between " + small + " to " + big + ": ");
                input = scanner.nextInt();
            } else {
                small = input; //因為你猜太小了,但是又比1大,所以更新small
                guessTimes += 1; //記數+1
                System.out.println("Wrong. Guess Bigger");
                System.out.print("Please enter a number between " + small + " to " + big + ": ");
                input = scanner.nextInt();
            }
        }
        if (secret == input) {
            System.out.println("You win, the number is " + secret); //猜對結果
        } else {
            System.out.println("You loose, the number is " + secret); //超過五次結果
        }
    }


}
