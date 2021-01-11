package com.gmail.chiyc88.learning.objtest;

public class Score {
    private int mathRate;
    private int englishRate;
    private int scienceRate;

    public Score(int mathRate, int englishRate, int scienceRate) {
        setMathRate(mathRate);
        setEnglishRate(englishRate);
        setScienceRate(scienceRate);
    }

    private void setScienceRate(int scienceRate) {
        this.scienceRate = scienceRate;
    }

    private void setEnglishRate(int englishRate) {
        this.englishRate = englishRate;
    }

    private void setMathRate(int mathRate) {
        this.mathRate = mathRate;
    }

    public int addUp(int math, int english, int science) {
        return math * mathRate + english * englishRate + science * scienceRate;
    }
}
