package com.gmail.chiyc88.learning.inherit;

public class Person {
    public int height;
    public int weight;
    public int bmi;
    public Person(int height,int weight){
        this.height = height;
        this.weight = weight;
    }
    public void calcluateBMI(){
        bmi = height^2/weight;
    }
    public void printBMI(){
        System.out.println("BMI:" + bmi);
    }
}
