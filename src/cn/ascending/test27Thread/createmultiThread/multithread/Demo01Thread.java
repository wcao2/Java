package cn.ascending.test27Thread.createmultiThread.multithread;

/*
*  create multi thread method1: create Thread son class
* */
public class Demo01Thread {
    //一个main线程 一个新线程 一起抢夺cpu执行权
    public static void main(String[] args) {
        //3 创建thread类的子类对象
        MyThread mt=new MyThread();//开辟一条通向cpu的新路径 用来执行run方法 对于cpu而言 就有了两条执行的路径 就有了选择的权利 两个线程 一起抢夺cpu执行权(执行时间)

        //4 调用Thread类中的start方法 开启新线程 执行run方法 不用mt.run() 因为他在主线程里面       System.out.println(0/0);
        mt.start();//开辟新空间 执行run方法

        //主线程
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }

       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
            }
        }).start();*/

        /*new Thread(()->{
            System.out.println("test");
        }).start();*/
    }
}
