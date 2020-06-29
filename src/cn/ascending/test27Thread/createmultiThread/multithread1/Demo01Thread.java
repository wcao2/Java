package cn.ascending.test27Thread.createmultiThread.multithread1;

/*
*   创建多线程程序的第二种方式 实现Runnable接口
*   java.lang.Runnable 接口应该通过线程执行其实例的类来实现，类必须定义一个无参数的构造方法
*   java.lang.Thread 可以传递Runnable接口的实现类对象
*
*   st1:创建runnable接口实现类(implementation class)
*   st2:实现类重写run方法
*   st3:创建runnable接口实现类对象(implementation object)
*   st4:创建Thread对象 构造方法中传递Runnable接口的实现类对象
*   st5:调用Thread类中的start方法，开启新的线程执行run方法
* */
//两个线程相互抢资源

//1
public class Demo01Thread implements Runnable{

    @Override
    //2
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"------->"+i);
        }
    }

    public static void main(String[] args) {
        //3
        Runnable run=new Demo01Thread();
        //4
        Thread t=new Thread(run);
        //5
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"====>"+i);
        }
    }
}
