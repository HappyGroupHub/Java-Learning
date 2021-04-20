package com.gmail.chiyc88.learning.midterm.grade1second;

public class Exam5 {
    public static void main(String[] args) {
        Exam5Student stu = new Exam5Student(); //這裡import Exam5Student 命名簡寫成stu
        int sum = stu.average();
        System.out.println(sum);
    }
}


//為甚麼會紅紅的ㄋ
//因為我們剛剛的function有回傳int值
//跑一次debug給你看 為甚麼我說debug很好用
//好了
//到目前為止, function會了ㄇ