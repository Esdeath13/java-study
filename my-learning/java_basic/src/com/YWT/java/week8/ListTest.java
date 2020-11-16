package com.YWT.java.week8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/16 15:18
 **/
public class ListTest {
    public static void main(String[] args) {
        //创建List接口实现类的对象，泛型为String
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java");
        list.add("JavaScript");
        list.add("Java");
        //随机取出list中的元素

        //for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : list){
            System.out.println(s + ",");
        }
        //用Itergtor迭代器遍历list
        System.out.println("用Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + ",");
        }
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println(s));
        System.out.println("使用Lambda的方法遍历list，有手就行！");
        list.forEach(System.out::println);
    }

}
