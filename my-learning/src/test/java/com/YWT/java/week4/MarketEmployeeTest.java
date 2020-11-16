package com.YWT.java.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee me = new MarketEmployee("admin");
        me.print();
    }

    @Test
    public void getSalary() {
        MarketEmployee me = new MarketEmployee("admin");
        int salary = me.getSalary("admin");
        assertEquals(3000,salary);

        //建议如下操作
        BaseEmployee you = new MarketEmployee("user");
        assertEquals(1000, you.getSalary("admin"));


    }
}