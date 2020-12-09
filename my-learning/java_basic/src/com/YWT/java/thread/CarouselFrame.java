package com.YWT.java.thread;

import sun.font.TextLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;

/**
 * @ClassName CarouselFrame
 * @Description TODO
 * @Author YWT
 * @Date 2020/12/7 19:25
 **/
public class CarouselFrame extends JFrame {
    private JLabel bglabel;
    private JLabel timeLabel;
    private  JLabel textLabel;

    public  CarouselFrame(){
        init();
        setTitle("CarouselFrame");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        bglabel = new JLabel();
        CarouselTHread ct = new CarouselTHread();
        ct.setBgLabel(bglabel);
        new Thread(ct).start();
        this.getContentPane().add(bglabel, BorderLayout.CENTER);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
        this.getContentPane().add(timeLabel,BorderLayout.SOUTH);
        TimeThread tt = new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();
        //***********
        textLabel = new JLabel();
        textLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
        this.getContentPane().add(textLabel, BorderLayout.NORTH);
        TextThread tt1 = new TextThread();
        tt1.setTextLabel(textLabel);
        new Thread(tt1).start();


    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}
