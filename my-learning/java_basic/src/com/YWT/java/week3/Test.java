package com.YWT.java.week3;

import java.util.Random;

/**
 * @ClassName Test
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/19 14:48
 **/
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] data = new int[10][2];
        for(int[] tmp : data){
            tmp[0] = random.nextInt(1000);
            tmp[1] = random.nextInt(1000);
            System.out.println(OverLoadTest.sum(tmp[0], tmp[1]));
        }
    }
}
