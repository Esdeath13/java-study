package com.YWT.java.frame;

import javax.swing.*;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/7 19:27
 **/
public class StudentFrame {
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentFrame");
        frame.setContentPane(new StudentFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
