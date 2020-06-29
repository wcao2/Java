package cn.ascending.test26Lambda.introduce;

/*
*  创建Runnable接口实现类 重写run方法 设置线程任务
*  1.1
* */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" new thread is created");
    }
}
