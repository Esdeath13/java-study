package com.YWT.java.week1;

/**
 * @ClassName Factorial
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/5 16:43
 **/
public class Factorial {
    public static void main(String[] args) {
        //定义一个整型变量
        int n = 5;
        int result = 1; 
        for (int i = 1;i <= n; i++){
            result = result * i;
        }
        System.out.println(n + "的阶乘是：" + result);
    }


}
