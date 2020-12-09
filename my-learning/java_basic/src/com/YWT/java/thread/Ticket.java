package com.YWT.java.thread;

/**
 * @ClassName Ticket
 * @Description TODO
 * @Author YWT
 * @Date 2020/12/7 14:23
 **/
public class Ticket {
    public static void main(String[] args) {

        //创建3个线程，传入 线程名: [001]、[002]...并开启
        for(int i=1 ; i<4; i++){
            new SaleThread("[00"+i+"]").start();
        }

    }
}

class SaleThread extends Thread {

    //车票数被共享,所以定义为static,数量为20.
    private static int ticket = 20;
    //通过锁来保证线程不会重复访问.
    private static Object obj = new Object();

    //有参构造传入线程名
    public SaleThread(String name) {
        super(name);
    }
    public SaleThread() {

    }

    //重写run()方法，将售票动作放入其中;
    @Override
    public void run() {
        while (true) {
            //在锁外使用sleep( )；以便于更好的解决复现问题
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //使用synchron  ized需要锁统一资源,不然没效果,所以将obj初始化为static静态。
            //但让也可以使用字符串 synchronized("lock");lock随便输入
            synchronized (obj) {

                //还有余票---出票
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "号窗口第"
                            + ticket + "票正在出票...");
                    ticket--;
                } else {
                    //车票售完
                    System.out.println("车票已售完，下次请趁早...");
                    //不能使用break或者return,后面进行解释。
                    System.exit(0);
                }
            }
        }
    }
}