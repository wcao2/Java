package cn.ascending.test26Lambda.introduce;

public class Demo02Lamda {
    public static void main(String[] args) {
        //使用匿名内部类方式实现多线程(好处 省去定义实现类 无参数 无返回值)
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" new Thread is created");
            }
        }).start();


        //使用lambda表达式 实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" lambda expression的线程创建了");
        }).start();

        System.out.println(
                Thread.currentThread().getName()
        );
    }
}
