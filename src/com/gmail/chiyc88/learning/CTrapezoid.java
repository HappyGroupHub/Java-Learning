package com.gmail.chiyc88.learning;

public class CTrapezoid {
    int upper;
    int base;
    int height;

    public static void main(String[] args) {
        CTrapezoid ctRapezoid = new CTrapezoid();
        ctRapezoid.upper = 6;
        ctRapezoid.base = 10;
        ctRapezoid.height = 8;
        show(ctRapezoid.upper, ctRapezoid.base, ctRapezoid.height);
        System.out.println("Ans: " + area(ctRapezoid.upper, ctRapezoid.base, ctRapezoid.height));
    }

    public static double area(int upper, int base, int height) {
        return (upper + base) * height / 2;
    }

    public static void show(int upper, int base, int height) {
        System.out.println(upper);
        System.out.println(base);
        System.out.println(height);
    }
}
