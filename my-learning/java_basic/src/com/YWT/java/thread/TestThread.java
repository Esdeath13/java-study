package com.YWT.java.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @ClassName TestThread
 * @Description TODO
 * @Author YWT
 * @Date 2020/12/7 14:11
 **/
public class TestThread extends Thread{
//    private final String name;
//    public  TestThread(String name){
//        this.name = name;
//    }
    @Override
    public void run(){
        System.out.println(LocalDateTime.now());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
