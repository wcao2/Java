package cn.ascending.test27Thread.ThreadPool;

//2:设置线程任务
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 创建一个新线程");
    }
}
