package com.YWT.java.thread;

import com.YWT.java.week3.Test;

/**
 * @ClassName ThreadMain
 * @Description TODO
 * @Author YWT
 * @Date 2020/12/7 14:16
 **/
public class ThreadMain {
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        tt.setName("窗口1");
        tt.start();
        TestThread tt1 = new TestThread();
        tt1.start();
    }
}
