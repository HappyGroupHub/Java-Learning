package com.gmail.chiyc88.learning.homework;

public class Main {
    public static void main(String[] args) {
        Customer[] allCustomers = {
                new Customer("0013", 490, 0),
                new Customer("0052", 1000, 100),
                new Customer("0081", 290, 0),
                new Customer("2122", 2000, 200)
        };
        for (int i = 0; i < allCustomers.length; i++) {
            allCustomers[i].print();
        }
    }
}
