package com.gmail.chiyc88.learning.objoriented;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Invalid value.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Invalid value.");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private int getBaseSalary() {
        return baseSalary;
    }
}