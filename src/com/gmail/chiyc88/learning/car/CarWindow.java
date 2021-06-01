package com.gmail.chiyc88.learning.car;

import javax.swing.*;

public class CarWindow {

    private JPanel mainPanel;
    private JPanel centerPanel;
    private JTextField textField1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new CarWindow().mainPanel);
        jFrame.setSize(1024,768);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
