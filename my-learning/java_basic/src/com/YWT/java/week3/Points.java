package com.YWT.java.week3;

import java.sql.SQLOutput;


/**
 * @ClassName Points
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/25 10:47
 **/
public class Points {
    private int x;
    private int y;
    public Points(){
        x=0;y=0;
    }
    public Points(int x, int y){
        this.x = x;this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double Distance(Points p)
    {
        int diffx = p.getX() - this.x;
        int diffy = p.getY() - this.y;
        return Math.sqrt(diffx * diffx + diffy * diffy);
    }

}

