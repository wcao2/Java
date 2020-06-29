package cn.ascending.test26Lambda.introduce;

public class Demo01Runnable {
    public static void main(String[] args) {
        //1.2:创建接口的实现类对象
        RunnableImpl run=new RunnableImpl();
        //创建Thread类对象 构造方法中传递实现类
        Thread t=new Thread(run);
        //调用start 开启新线程 执行run方法
        t.start();

        //2:简化代码 使用匿名内部类 实现多线程程序
        Runnable r=new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+" new Thread created");
            }
        };
        new Thread(r).start();

        //简化+ 匿名内部类+匿名对象
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+" new Thread created");
            }
        }).start();

        //3:简化++  new Thread() 里面的参数必须是Runnable接口的实现类对象
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" lambda expression的线程创建了");
        }).start();
    }
}
