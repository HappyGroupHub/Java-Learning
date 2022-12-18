package com.gmail.chiyc88.learning.readfile;

public class Movie {
    String name;
    String date;
    String director;
    String actor;

    public Movie(String data) {
        String[] tks = data.split(",");
        name = tks[0];
        date = tks[1];
        director = tks[2];
        actor = tks[3];
    }
}
