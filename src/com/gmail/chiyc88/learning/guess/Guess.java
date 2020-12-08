package com.gmail.chiyc88.learning.guess;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        startNewGame();
    }

    public static Scanner startNewGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100 - 1);
        int small = 1;
        int big = 100;
        int counter = 1;
        guessingLoop(scanner, secret, small, big, counter);
        return scanner;
    }

    public static void guessingLoop(Scanner scanner, int secret, int small, int big, int counter) {
        int number;
        while (true) {
            System.out.print("Guess a number (" + small + "-" + big + ") : ");
            number = scanner.nextInt();
            if (number < small || number > big) {
                System.out.println("Please enter a valid value.");
                System.out.println("");
                continue;
            } else if (number == secret) {
                System.out.println("You got the right answer!");
                System.out.println("");
                System.out.println("Total : Guessed " + counter + " times.");
                break;
            } else if (number > secret) {
                big = number;
                counter = counter + 1;
                System.out.println("Smaller, secret number is between " + small +" to " + big);
                System.out.println("");
                continue;
            } else {
                small = number;
                counter = counter + 1;
                System.out.println("Bigger, secret number is between " + small + " to " + big);
                System.out.println("");
                continue;
            }
        }
        playAgainQuestion(scanner);
    }
    public static void playAgainQuestion(Scanner scanner) {
        System.out.print("Do you want to play again? (Y/N) : ");
        String yesorno = scanner.next();
        if (yesorno.matches("Y")) {
            System.out.println("");
            startNewGame();
        } else if (yesorno.matches("N")) {
            System.out.println("Thanks for playing.");
        }
    }
}

//猜數字遊戲