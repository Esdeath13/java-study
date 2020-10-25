package com.YWT.java.week3;

import java.util.Scanner;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/25 11:06
 **/
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入点坐标：");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c =Math.pow(Math.pow(10-b1, 2)+Math.pow(20-b2, 2),0.5);

        if (c < 5){
            System.out.println("点("+b1+","+b2+")在圆内");
        }else{
            System.out.println("点("+b1+","+b2+")没有在圆内");
        }
    }
}
