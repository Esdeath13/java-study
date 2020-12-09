package com.YWT.java.thread;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName CarouselTHread
 * @Description TODO
 * @Author YWT
 * @Date 2020/12/7 19:07
 **/
public class CarouselTHread implements Runnable{
    private String[] imgs = {
            "https://esdeath-ywt.oss-cn-hangzhou.aliyuncs.com/img/0-1545452425605-S7Qd_415-369.webp",
            "https://esdeath-ywt.oss-cn-hangzhou.aliyuncs.com/img/0-1545452499736-39AP_1080-896.webp",
            "https://esdeath-ywt.oss-cn-hangzhou.aliyuncs.com/img/QQ%E5%9B%BE%E7%89%8720201123191247.jpg",
            "https://esdeath-ywt.oss-cn-hangzhou.aliyuncs.com/img/u%3D394302939%2C1347587034%26fm%3D26%26gp%3D0.jpg",
    };
    private JLabel bgLabel;
    public void setBgLabel(JLabel bgLabel){
        this.bgLabel = bgLabel;
    }
    @Override
    public void run(){
        int index = 0;
        int len = imgs.length;
        while (true){
            try {
                URL url = new URL(imgs[index]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);
                InputStream is = conn.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int length = 0;
                while ((length = is.read(buffer)) != -1){
                    baos.write(buffer, 0, length);
                }
                byte[] bytes = baos.toByteArray();
                is.read(bytes);
                Icon icon = new ImageIcon(bytes);
                this.bgLabel.setIcon(icon);
                Thread.sleep(2000);
                baos.close();
                is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            index++;
            if (index == len){
                index = 0;
            }
        }
    }
}
