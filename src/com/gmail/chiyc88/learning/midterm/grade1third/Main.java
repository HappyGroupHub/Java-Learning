package com.gmail.chiyc88.learning.midterm.grade1third;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Packages packages = new Packages();
        System.out.print("Please enter object's length: ");
        packages.length = scanner.nextInt();
        System.out.print("Please enter object's width: ");
        packages.width = scanner.nextInt();
        System.out.print("Please enter object's height: ");
        packages.height = scanner.nextInt();
        int money = packages.getMoney();
        if (money == 40) {
            System.out.println("一號便利箱, " + money + "元");
        } else if (money == 50) {
            System.out.println("二號便利箱, " + money + "元");
        } else if (money == 60) {
            System.out.println("三號便利箱, " + money + "元");
        } else if (money == 70) {
            System.out.println("四號便利箱, " + money + "元");
        } else if (money == 80) {
            System.out.println("五號便利箱, " + money + "元");
        } else if (money == 90) {
            System.out.println("六號便利箱, " + money + "元");
        }
    }
}
