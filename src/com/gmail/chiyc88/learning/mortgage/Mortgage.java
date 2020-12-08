package com.gmail.chiyc88.learning.mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        int loan = (int)askQuestion("Loan ($1K - $1M): ", 1000 , 1_000_000);
        double annualInterest = (double)askQuestion("Annual Interest Rate: ", 0, 30);
        int years = (int)askQuestion("Period (Years): ", 1, 30);
        printMortgage(formatter, loan, annualInterest, years);
        printPaymentSchedule(formatter, loan, annualInterest, years);
    }

    public static double askQuestion(String question, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double input;
        while (true) {
            System.out.print(question);
            input = scanner.nextDouble();
            if (input >= min && input <= max) {
                break;
            }
            System.out.println("Enter a number between " + min + " to " + max);
        }
        return input;
    }

    public static double mortgageCaculator(int loan, double annualInterest, int years) {
        double monthlyInterest = annualInterest / 12 / 100;
        int months = years * 12;
        double molecular = loan * monthlyInterest * Math.pow(monthlyInterest + 1, months);
        double denominator = Math.pow(monthlyInterest + 1, months) - 1;
        double result = molecular / denominator;
        return result;
    }

    public static double paymentSecdule(int loan, double annualInterest, int years, int paymentsMade) {
        double monthlyInterest = annualInterest / 12 / 100;
        int paymentsTimes = years * 12;
        double payments = loan * (Math.pow(1 + monthlyInterest, paymentsTimes) - Math.pow(1 + monthlyInterest, paymentsMade)) / (Math.pow(1 + monthlyInterest, paymentsTimes) - 1);
        return payments;
    }

    public static void printMortgage(NumberFormat formatter, int loan, double annualInterest, int years) {
        double result = mortgageCaculator(loan, annualInterest, years);
        System.out.println("");
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + formatter.format(result));
    }

    public static void printPaymentSchedule(NumberFormat formatter, int loan, double annualInterest, int years) {
        System.out.println("");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (int i = 1; i <= years * 12; i++) {
            double payments = paymentSecdule(loan, annualInterest, years, i);
            System.out.println(formatter.format(payments));
        }
    }
}