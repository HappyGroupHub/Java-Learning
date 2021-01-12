package com.gmail.chiyc88.learning.midterm.grade1second;

public class Exam6Student {
    private String name;
    private int math;
    private int english;

    public Exam6Student(String name, int math, int english) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        System.out.println("姓名:" + name + " 數學:" + math + " 英文:" + english);
    }
}
