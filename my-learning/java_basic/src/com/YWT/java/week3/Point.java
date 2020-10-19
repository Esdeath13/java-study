package com.YWT.java.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Point
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/19 16:08
 **/

public class Point {
    private Integer x;
    private Integer y;

    public  Point(){
        System.out.println("点被初始化！");
    }

    public  Point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("点被初始化！");
    }

    public void print(){
        System.out.println("横坐标：" + this.x + "纵坐标：" + this.y);
    }
}
