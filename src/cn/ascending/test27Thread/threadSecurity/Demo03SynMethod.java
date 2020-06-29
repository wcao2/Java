package cn.ascending.test27Thread.threadSecurity;

/*
* 解决线程安全的第二种方式 ==>同步方法
*  1:把访问共享数据的代码抽取出来 放到个方法中
*  2: 在方法上加入synchronized修饰符
*  修饰符 synchronized 返回值类型 方法名(参数列表){
*       //可能会产生线程安全问题的代码(访问了共享数据的方法)
*  }
*
* */
public class Demo03SynMethod implements Runnable {
    public int ticket=20;

    //Set up thread tasks: sell ticketDemo02SynLock
    public void run() {
        System.out.println("this: "+this);//同步方法的锁对象就是线程的实现类对象 this
        while (true){
            this.payTicket();
        }
    }
    //define a sync method
    //也会把方法内部代码锁住 只让一个线程执行
    // 同步方法的锁对象就是实现类对象 new Demo03SynMethod() 也就是this 谁调用方法(payTicket) 方法中的对象就是谁(创建对象之后产生)
    public synchronized void payTicket(){
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

    //create three threads, to sell the ticket
    public static void main(String[] args) {
        //创建runnable接口的实现类对象 为了共享票源 创建一个实现类对象
        Runnable run=new Demo03SynMethod();
        System.out.println("run "+run);
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
