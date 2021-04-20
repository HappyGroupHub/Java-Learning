package com.gmail.chiyc88.learning.midterm.grade1third;

public class Packages {
    public int length;
    public int width;
    public int height;

    public int getMoney() {
        if (length <=5 && width <= 10 && height <= 10) {
            return 40;
        } else if (length <= 10 && width <= 10 && height <= 10) {
            return 50;
        } else if (length <= 15 && width <= 10 && height <= 10) {
            return 60;
        } else if (length <= 15 && width <= 15 && height <= 10) {
            return 70;
        } else if (length <= 15 && width <= 15 && height <= 15) {
            return 80;
        } else if (length <= 20 && width <= 20 && height <= 20) {
            return 90;
        }
        return 0;
    }
}
