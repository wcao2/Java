package cn.ascending.test27Thread.methodInThread;


/*
*   使当前正在执行的线程以指定的毫秒数暂停
*   毫秒结束之后 线程继续执行
* */
public class  MyThread3{
    public static void main(String[] args) {
        for (int i = 1; i <=60 ; i++) {
            System.out.println(i);
            //使用Thread类的sleep()方法 让程序睡眠1s 是一个静态方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
