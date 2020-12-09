package com.YWT.java.week9;
import java.io.File;
import java.time.LocalDate;
import java.util.Locale;

/**
 * @ClassName Main
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/30 14:36
 **/


public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String dirName = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
        File dir = new File("/users/76108/Desktop/" + dirName);
        if (!dir.exists()){
            boolean flag = dir.mkdirs();
            System.out.println(flag);
        }
        boolean success = dir.delete();
        if (success) {
            System.out.println("Successfully deleted empty directory: " + dir);
        } else {
            System.out.println("Failed to delete empty directory: " + dir);
        }

        String directories = "D:\\Java\\面对对象\\异常\\集合\\io\\多线程";
        String directories1 = "D:\\Java\\面对对象\\异常\\集合\\io\\字节流\\字符流";
        File file = new File(directories);
        File file1 = new File(directories1);
        boolean result = file.mkdirs();
        boolean result1 = file1.mkdirs();
        System.out.println("Status = " + result);
        System.out.println("Status = " + result1);
    }
}
