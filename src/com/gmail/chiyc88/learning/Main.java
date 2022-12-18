package com.gmail.chiyc88.learning;


public class Main {

    static int a = 200;
    public static void main(String[] args) {
        Main.a = 300;
        Main c = new Main();
        System.out.println(c.a);
        Main d = new Main();
        System.out.println(d.a);
    }
}
