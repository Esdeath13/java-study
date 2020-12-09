package com.YWT.java.week9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * @ClassName TxtFileTest
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/30 15:57
 **/
public class TxtFileTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        File file = new File("Users\\76108\\Desktop\\result.txt");
        Writer out = new FileWriter(file, true);
        out.write(chars);
        out.close();
    }
}
