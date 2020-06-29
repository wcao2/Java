package cn.ascending.test27Thread.methodInThread;

/*
*   how to get Thread name:
*   1:使用Thread类中的方法getName();  String getName() 返回该线程的名称
*   2:获取当前正在执行的线程 使用线程中的getName() 方法获取线程名称 static Thread currentThread() 返回对当前正在执行的线程对象引用
* */


public class MyThread extends Thread{
    @Override
    public void run(){
        //set the thread tasks, and get thread name
        String name=getName();//因为mythread继承Thread,所以可以直接使用方法getName()
        System.out.println("name is"+name);
        //get current Thread

        Thread t=Thread.currentThread();
        System.out.println("t is "+t);//获取当前正在执行的线程[thread name;priority;which method(main)]
        System.out.println(t.getName());

        //链式编程
        //System.out.println(Thread.currentThread().getName());
    }

    /*
    *  main Thread: main
    *  new Thread: Thread-0, Thread-1....
    * */
    public static void main(String[] args) {
        //create Thread subclass object
        MyThread mt=new MyThread();
        //call start method, start a new Thread, execute run method
        mt.start();//in order to multiple thread, so I do not use mt.run()
        new MyThread().start();
        //get main Thread
        System.out.println("Current Thread is "+Thread.currentThread());
        System.out.println("Current Thread is "+Thread.currentThread().getName());
    }
}
//print three thread name