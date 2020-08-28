package cn.ascending.test27Thread.threadSecurity;

//in here is a big problem
public class Demo01Ticket implements Runnable{
    public int ticket=20;

    @Override
    //Set up thread tasks: sell ticket
    public void run() {
        while (true){
            if(ticket>0){
                try {
                    //提高线程安全问题的几率 执行到if语句 失去cpu的执行权
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"---->"+" is selling the number of "+ticket);
                ticket--;
            }
        }
    }

    //create three threads, to sell the ticket
    public static void main(String[] args) {
        //创建runnable接口的实现类对象 为了共享票源 创建一个!!!!!实现类对象==> Create an interface's implementation object
        Runnable run=new Demo01Ticket();
        //创建Thread类对象 构造方法中传递Runnable接口的实现类对象
        Thread t=new Thread(run);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        //调用start方法 开启多线程
        t.start();
        t1.start();
        t2.start();
    }
}
