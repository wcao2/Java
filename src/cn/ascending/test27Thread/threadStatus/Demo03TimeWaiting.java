package cn.ascending.test27Thread.threadStatus;

/*
*   TimeWaiting 有两种方式
*  1: 使用sleep(long m)方法 毫秒值结束之后 线程睡醒 进入Runnable状态或者Blocked状态
*  2: 使用wait(long m)方法  方法如果在毫秒值结束之后 还没有被notify 就会自动醒来  进入Runnable状态或者Blocked状态
*
*  唤醒方法
*  1: void notify()唤醒单个线程
*  2: void notifyall()唤醒所有线程
* */
public class Demo03TimeWaiting {
    public static void main(String[] args) {
        Object obj=new Object();
        //顾客1
        new Thread(){
            @Override
            public void run(){
                while(true){
                    synchronized (obj){
                        System.out.println("顾客一饿了");
                        try{
                            //obj.wait(2000);//2000ms后自动醒来
                            obj.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("顾客一可以吃了");
                        System.out.println("===================");
                    }
                }
            }
        }.start();
        //顾客2
        new Thread(){
            @Override
            public void run(){
                while(true){
                    synchronized (obj){
                        System.out.println("顾客二饿了");
                        try{
                            //obj.wait(3000);//3000ms后自动醒来
                            obj.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        //唤醒之后的代码
                        System.out.println("顾客二可以吃了");
                        System.out.println("===================");
                    }
                }
            }
        }.start();

        //创建一个老板线程
        new Thread(){
            @Override
            public void run(){
                //一直做包子
                while(true){
                    //花五秒做包子 睡眠五秒
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒的线程只能有一个在执行 需要使用同步技术
                    synchronized (obj){
                        System.out.println("五秒做好 现在可以吃");
                        //做好包子 调用notify 唤醒顾客吃包子 notify() 如果有多个线程等待 随机唤醒一个
                        obj.notifyAll();//唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
