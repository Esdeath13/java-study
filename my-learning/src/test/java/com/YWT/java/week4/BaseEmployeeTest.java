package com.YWT.java.week4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BaseEmployeeTest {

    @Test
    public void print(){

    }

    @Test
    public void getSalary(){
        //上转型对象
        BaseEmployee be = new MarketEmployee();
        //be = new OtherEmployee();

        List<String> list = new ArrayList<>();
    }
}