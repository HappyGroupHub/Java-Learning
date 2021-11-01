package com.gmail.chiyc88.learning.guess;

import java.util.Random;
import java.util.Scanner;

public class EzGuess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(10 - 1); //設定random出來的數字是1~10, 記得括號內設定範圍時, 要大在小
        int big = 10; //先設定big變數, 等他猜下一輪的時候會用到
        int small = 1; //先設定small變數, 等他猜下一輪的時候會用到
        System.out.print("Please enter a number (1-10): "); //第一次猜測鎖死(1-10)
        int input = scanner.nextInt();
        while (secret != input) { //當秘密數字跟你猜的不等於時,就會無限執行
            if (input > secret) { //當你猜的數字大於秘密數字
                big = input; //因為你猜太大了,但是又比10小,所以更新big
                System.out.println("Wrong. Guess Smaller");
                System.out.print("Please enter a number (" + small + "-" + big + "): ");
                input = scanner.nextInt();
            } else {
                small = input; //因為你猜太小了,但是又比1大,所以更新small
                System.out.println("Wrong. Guess Bigger");
                System.out.print("Please enter a number (" + small + "-" + big + "): ");
                input = scanner.nextInt();
            }
        }
        System.out.println("Good job! The answer is " + secret); //樓上While迴圈結束會來這裡
    }


}
