package cn.ascending.test27Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
*  java.util.concurrent.Executors:线程池工厂类 用来生产线程池
*  Executors类中的静态方法 static ExecutorService newFixedThreadPool(int Thread) 创建一个可重用固定线程数的线程池
*  参数: 线程池中线程数量
*  返回值: ExecutorService接口 返回的是接口的实现类对象
*  java.util.concurrent.ExecutorService 线程池接口
*      （从线程池获取线程 调用start方法 执行线程任务）
*           submit(Runnable task)提交一个Runnable任务用于执行
* */
public class ThreadPool {
    public static void main(String[] args) {
        //1使用线程池工厂类Executors提供的静态方法newFixedThreadPool产生一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);//返回线程池实现类 用接口来接收
        //3调用submit方法 传递线程任务(实现类) 开启线程 执行run方法
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        //线程池会一直开启 使用完了线程 会自动把线程归还给线程池 线程可以继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //销毁线程池 不建议使用
        es.shutdown();
    }
}
