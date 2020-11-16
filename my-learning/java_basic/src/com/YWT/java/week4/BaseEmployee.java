package com.YWT.java.week4;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/26 14:39
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     * @param id 员工工资
     * @return
     */
    public abstract int getSalary(String id);
}
