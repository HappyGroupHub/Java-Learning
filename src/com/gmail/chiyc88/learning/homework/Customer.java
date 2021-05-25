package com.gmail.chiyc88.learning.homework;

public class Customer {
    String customerID;
    int cost;
    int discount;
    int sum;

    public Customer(String customerID, int cost, int discount) {
        this.customerID = customerID;
        this.cost = cost;
        this.discount = discount;
        sum = cost - discount;
    }

    public void print() {
        System.out.println(customerID + " " + cost + " " + discount + " " + sum);
    }

}
