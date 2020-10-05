package com.YWT.java.week1;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Arr
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/5 16:41
 **/
public class Arr {
    final static int MAX = 5;
    public static void main(String[] args) {
        int[] a= new int[MAX];
        Random random = new Random();
        for(int i = 0;i < MAX; i++){
            a[i] = random.nextInt(100);
            System.out.println(a[i] + " ");

        }
        int max = a[0];
        for(int i = 0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("最大值为：" + max);
        int min = a[0];
        for(int i = 0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("最小值为：" + min);
        int sum = a[0];
        for (int i = 0; i<a.length; i++){
            sum += a[i];
        }
        System.out.println("和为：" + sum);
        Arrays.sort(a);
        System.out.println("排序后：" + Arrays.toString(a));
    }
}
