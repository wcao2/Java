package cn.ascending.test27Thread.threadStatus;

/*
×   等待唤醒案例:线程之间的通信

*  waiting 顾客要买包子 和老板说买包子的种类和数量
*  顾客就等着老板做包子(调用wait方法) waiting状态 无限等待
*
*  老板开始做包子 做好包子 告诉(notify方法)顾客包子做好了

    创建一个顾客线程(消费者) 告知老板要的包子的种类和数量 调用wait()方法 放弃cpu的执行 进入到waiting状态(无限等待状态:Infinite wait state)
    再创建一个老板线程 花五秒做包子 做好包子 调用notify方法 唤醒顾客吃包子

    注意:顾客和老板线程 必须使用同步代码块 包裹起来 保证等待和唤醒只能有一个在执行 同步使用的锁对象必须保证唯一 只有锁对象才能调用wait和notify方法

    Object类有 void wait()  void notify()方法 继续执行wait之后的代码
* */
public class Demo02Waiting {
    public static void main(String[] args) {
        //创建锁对象 保证唯一
        Object obj=new Object();

        //创建一个老板线程
        new Thread(() -> {//Anonymous function
            //一直做包子
            while(true){
                //花五秒做包子 睡眠五秒
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒的线程只能有一个在执行 需要使用同步技术
                synchronized (obj){
                    System.out.println("五秒做好 现在告诉顾客可以吃了");
                    //做好包子 调用notify 唤醒顾客吃包子 || 等待的线程从wait set中释放出来 重新进入调度队列(ready queue)中
                    obj.notify();//锁对象可以通过notify唤醒使用同一个锁对象调用wait方法后的线程
                }
            }
        }).start();

        //创建一个顾客线程(消费者)
        new Thread(){//Anonymous innder class
            @Override
            public void run(){
                //一直等着买包子
               while (true){
                   //保证等待和唤醒的线程只能有一个在执行 需要使用同步技术
                   synchronized (obj){
                       System.out.println("告知要的数量种类");
                       //调用wait方法 放弃cpu执行 进入到waiting状态
                       try{
                           obj.wait();
                       }catch (Exception e){
                           e.printStackTrace();
                       }
                       //唤醒之后执行的代码
                       System.out.println("包子做好了 开吃");
                       System.out.println("------------------------");
                   }
               }
            }
        }.start();

    }
}
