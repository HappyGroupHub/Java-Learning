package com.gmail.chiyc88.learning.box;

public class Box2 extends Box{

    public Box2() {
        length = 15;
        height = 15;
        width = 10;

    }

    @Override
    public String getName() {
        return "Box2";
    }

    @Override
    public int getPrice() {
        return 40;
    }
}
