package cn.ascending.test27Thread.createmultiThread.multithread2;


/*
*   匿名内部类实现线程的创建
*   匿名： 没有名字; 内部类：写在其他类内部的类
*   作用: 简化代码
*        1:把子类继承父类 重写父类的方法 创建子类对象在一步完成
*        2:把实现类实现接口 重写接口中的方法 创建实现类对象在一步完成
*   格式: new 父类/接口(){
*              重复父类/接口中的方法
*        }
* */
public class AnonymousThread {
    public static void main(String[] args) {
        //继承类的方式
        new Thread(){//16~23只是创建子类对象 还需要调用start方法开启
            @Override
            public void run(){
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"==>"+"good");
                }
            }
        }.start();
        //===========================================
        //实现接口的方式
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"==>"+"bad");
                }
            }
        };
        new Thread(r).start();
        //===========================================
        //简化实现接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"==>"+"better");
                }
            }
        }).start();
        // main thread
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"====>"+i);
        }
    }
}
