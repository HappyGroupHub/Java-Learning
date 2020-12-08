package com.gmail.chiyc88.learning.objoriented;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(50_000,20);
        int wage = employee.caculateWage(10);
        System.out.println(wage);
    }
}
