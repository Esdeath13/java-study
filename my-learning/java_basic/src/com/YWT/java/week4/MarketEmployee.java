package com.YWT.java.week4;

import java.security.PublicKey;

/**
 * @ClassName MarketEmployee
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/26 14:56
 **/
public class MarketEmployee extends BaseEmployee{
    //Alt + enter
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGHER_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarketEmployee(String id){
        this.id = id;
    }

    public MarketEmployee(){

    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is a MarketEmployee class.");
    }
    //super三种方法
    //调用构造方法
    //访问属性
    //访问父类当中的成员方法

    @Override
    public int getSalary(String id) {

        if ("admin".equals(this.id)){
            return HIGHER_SALARY;
        }else{
            return LOWER_SALARY;
        }

    }
}
