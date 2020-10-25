package com.YWT.java.week3;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/19 16:12
 **/
public class CircleApp {
    public static void main(String[] args) {

        Point point = new Point(10,20);
        Circle circle = new Circle(10,20,5);
        Cylinder cylinder = new Cylinder(10,10,5,6);
        point.print();
        circle.print();
        cylinder.print();
        //1.创建两个Point对象，求出两点之间的距离

        //2.创建一个Point对象，判断该点是否在上面的circle圆对象内

    }


}
