package com.gmail.chiyc88.learning.box;

public class Box3 extends Box{
    public Box3() {
        length = 20;
        width = 20;
        height = 20;
    }
    @Override
    public String getName() {
        return "Box3";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
