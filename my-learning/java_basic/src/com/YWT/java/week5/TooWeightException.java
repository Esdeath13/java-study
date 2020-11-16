package com.YWT.java.week5;

/**
 * @ClassName TooWeightException
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/2 16:55
 **/
public class TooWeightException extends Exception{
    private String msg;

    public TooWeightException(){
        super();
    }
    public TooWeightException(String msg){
        super();
        this.msg = msg;
    }
    public String showMsg(){
        return this.msg;
    }

}
