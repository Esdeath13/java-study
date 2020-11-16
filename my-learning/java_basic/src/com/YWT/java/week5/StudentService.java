package com.YWT.java.week5;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/2 16:32
 **/
public interface StudentService {
    /**
     *
     * 给student对象体验
     * @param student
     */
   boolean checkHealth(Student student) throws TooWeightException;
}
