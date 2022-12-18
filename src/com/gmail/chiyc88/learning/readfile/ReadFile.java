package com.gmail.chiyc88.learning.readfile;


import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args){
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\LD\\IdeaProjects\\Java-Learning\\src\\com\\gmail\\chiyc88\\learning\\readfile\\data.txt"));
            in.readLine();
            Movie movie = new Movie(in.readLine());
            while (movie.name != null) {
                System.out.println(movie.name);
                movie = new Movie(in.readLine());
            }
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}