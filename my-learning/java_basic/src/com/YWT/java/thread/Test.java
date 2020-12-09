package com.YWT.java.thread;

/**
 * @ClassName Test
 * @Description TODO
 * @Author YWT
 * @Date 2020/12/7 14:24
 **/
public class Test {

    public static void main(String[] args) {
        //得到对象
        SaleSys ss = new SaleSys();
        //把对象放入线程中
        for(int i=1;i<6;i++){
            new Thread(ss,"[00"+i+"]").start();
        }
    }
}

class SaleSys implements  Runnable {
    //定义票的总数
    private int ticket = 100;
    //定义一个线程同步对象
    private Object obj = new Object();

    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //同步锁
            synchronized(obj){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+" 售出第   "+ticket +"  张票");
                    ticket--;
                }else{
                    System.out.println("票已售完，请下次再来！");
                    System.exit(0);
                }
            }
        }

    }
}