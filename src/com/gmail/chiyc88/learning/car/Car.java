package com.gmail.chiyc88.learning.car;

public class Car {
    private String id;
    private String enterTime;

    public Car (String id) {
        this.id = id;
    }

    public Car (String id, String enterTime) {
        this.id = id;
        this.enterTime = enterTime;
    }

    public String getId() {
        return id;
    }

    public String getEnterTime() {
        return enterTime;
    }
}
