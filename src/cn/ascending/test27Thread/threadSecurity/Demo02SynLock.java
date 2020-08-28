package cn.ascending.test27Thread.threadSecurity;

/*
*  解决线程安全问题
*  1:==>同步代码块 synchronized(锁对象){
*                   可能出现问题的代码(共享数据)
*               }
*   锁对象:把同步代码块锁住 只让一个线程在同步代码块中执行;多个线程的锁对象必须是同一个
*
*   总结:同步中的线程， 没有执行完毕不会释放锁，同步外的线程没有锁进不去同步代码块(Synchronous code block)
*    保证了只有一个线程在同步中共享数据 保证了安全 程序频繁的判断锁 获取锁 释放锁 程序的效率会降低
* */
public class Demo02SynLock implements Runnable{
    public int ticket=20;

    //create lock object
    Object obj=new Object();

    @Override
    //Set up thread tasks: sell ticket
    public void run() {
        while (true){
            //同步代码块:只让一个线程在同步代码块中执行;多个线程的锁对象必须是同一个
            synchronized (obj){//this
                if(ticket>0){
                    try {
                        //提高线程安全问题的几率 执行到if语句 失去cpu的执行权
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"---->"+" is selling the number of "+ticket);
                    ticket--;
                }
            }
            //finish sync code block,release the lock object
        }
    }

    //create three threads, to sell the ticket
    public static void main(String[] args) {
        //创建runnable接口的实现类对象 为了共享票源 创建一个实现类对象
        Runnable run=new Demo02SynLock();
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
