package com.gmail.chiyc88.learning;

public class Casa {
    int a;
    int b;
    int sum;

    public static void main(String[] args) {
        Casa obj = new Casa();
        obj.a = 5;
        obj.b = 8;
        obj.sum = obj.a + obj.b;
        System.out.println("A: " + obj.a);
        System.out.println("B: " + obj.b);
        System.out.println("Sum: " + obj.sum);

        Compute compute = new Compute();
        int[] arr = {obj.a, obj.b, obj.sum};
        System.out.println("Q2sum: " + compute.average(arr));
    }
}

