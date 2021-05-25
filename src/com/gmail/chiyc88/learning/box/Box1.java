package com.gmail.chiyc88.learning.box;

public class Box1 extends Box{

    public Box1() {
        length = 10;
        height = 10;
        width = 10;
    }

    @Override
    public String getName() {
        return "Box1";
    }

    @Override
    public int getPrice() {
        return 30;
    }

}
