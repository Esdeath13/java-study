package com.YWT.java.week3;
import javax.xml.crypto.Data;
/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/19 13:52
 **/
public class OverLoadTest {
    public static Integer sum(Integer i1, Integer i2) {
        return i1 + i2;
    }

    public static Double sum(Double d1, Double d2) {
        return d1 + d2;
    }

    public static String sum(int s1, int s2) {
        int sumSecond = s1 + s2;
        int minutes = sumSecond / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        StringBuilder sb = new StringBuilder();
        if (days != 0) {
            sb.append(days).append("天");
        }
        if (hours != 0) {
            sb.append(hours).append("小时");
        }
        if (minutes != 0) {
            sb.append(minutes).append("分钟");
        }
        int seconds = sumSecond - 24 * days * 60 * hours * 60 * minutes - 60 * hours * 60 * minutes - 60 * minutes;
        if (seconds != 0){
            sb.append(seconds).append("秒");
        }
        return sb.toString();
    }


}