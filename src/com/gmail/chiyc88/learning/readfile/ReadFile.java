package com.gmail.chiyc88.learning.readfile;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\LD\\IdeaProjects\\Learning\\src\\com\\gmail\\chiyc88\\learning\\readfile\\data.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String nextLine;
        while ((nextLine = br.readLine()) != null) {
            System.out.println(nextLine);
        }
    }
}