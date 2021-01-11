package com.gmail.chiyc88.learning.objtest;

public class Score {
    private int mathRate;
    private int englishRate;
    private int scienceRate;

    public Score(int mathRate, int englishRate, int scienceRate) {
        this.mathRate = mathRate;
        this.englishRate = englishRate;
        this.scienceRate = scienceRate;
    }

    public int addUp(int math, int english, int science) {
        return math * mathRate + english * englishRate + science * scienceRate;
    }
}
