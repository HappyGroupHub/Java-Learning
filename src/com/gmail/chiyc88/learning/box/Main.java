package com.gmail.chiyc88.learning.box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box3 box3 = new Box3();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object\'s length: ");
        int length = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter object\'s height: ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("Length: " + length + ", width: " + width + ", height: " + height);
        if (box3.validate(length, width, height)) {
            System.out.println(box3.getName() + box3.getPrice());
        }
    }
}
