package com.YWT.java.week8;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest2
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/16 17:42
 **/
public class MapTest2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("John","Oracle");
        map.put("Susan","Oracle");
        map.put("Jerry","JDBC");
        map.put("Jim","Unix");
        map.put("Kevin","JSP");
        map.put("Lucy","JSP");

        map.put("Allen","JDBC");

        map.replace("lucy","CoreJava");

        System.out.println("for循环遍历");
        for (Map.Entry<String, String> entry:map.entrySet()){
            System.out.println("老师：" + entry.getKey() + "课程：" + entry.getValue());
        }
        System.out.println("Lambda遍历");
        map.forEach((key,value) -> System.out.println("老师：" + key + "课程：" + value));


        ArrayList<String> result = new ArrayList<>();
        map.forEach((key, value) ->{
            if ("JDBC".equals((value))) {

                result.add(key);
            }
        });
        System.out.println("所有教JDBC的老师：" + result);
    }
}
