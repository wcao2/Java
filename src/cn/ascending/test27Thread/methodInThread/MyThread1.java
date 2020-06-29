package cn.ascending.test27Thread.methodInThread;

/*
*  set Thread name
*  法1: 使用Thread中的方法setName(名字)  void setName(String name) 改变线程名称 使它与参数name相同
*  法2: 创建一个带参数的构造方法 参数传递线程名称 调用父类带参数构造方法 把线程名称传递给父类， 让父类给子线程起一个名字
*       Thread(String name)
* */
public class MyThread1 extends Thread{
    public MyThread1(){}
    public MyThread1(String name){
        //name给父类传递过去
        super(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //1
        MyThread1 mt=new MyThread1();
        mt.setName("first threadName");
        mt.start();
        //2
        new MyThread1("second threadName").start();
    }

}
