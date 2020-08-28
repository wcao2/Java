package cn.ascending.test27Thread.threadSecurity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*  第三种方案 使用lock锁
*  两个方法: void lock() 获取锁 void unlock()释放锁
*
*  1:成员位置创建ReentrantLock对象
*  2:可能出现安全问题的代码前调用Lock接口中的方法lock用来获取锁(call ... before code that may have a security problem)
* 3: 可能出现安全问题的代码后调用Lock接口中的方法lock用来unlock
* */
public class Demo04Lock implements Runnable {
    public int ticket=100;
    //1
    Lock l=new ReentrantLock();

    public void run() {
        while (true){
            //can see when and where to get the lock
            l.lock();
            if(ticket>0){
                try {
                    //提高线程安全问题的几率 执行到if语句 失去cpu的执行权
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"---->"+" is selling the number of "+ticket);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //can see when and where to release the lock
                    l.unlock();
                }

            }
        }
    }

    //create three threads, to sell the ticket
    public static void main(String[] args) {
        //创建runnable接口的实现类对象 为了共享票源 创建一个实现类对象
        Runnable run=new Demo04Lock();
        //创建Thread类对象 构造方法中传递Runnable接口的实现类对象
        Thread t=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        //调用start方法 开启多线程
        t.start();
        t1.start();
        t2.start();
    }
}
