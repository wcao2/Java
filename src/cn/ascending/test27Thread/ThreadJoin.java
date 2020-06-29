package cn.ascending.test27Thread;

/*
*  线程的合并指的是：将指定的线程加入到当前的线程之中，可以将两个交替执行的线程合并为顺序执行的线程，
*   Thread merging refers to: adding the specified thread to the current thread, and merging two alternately executed threads into sequentially executed threads,
*  如果在线程B中调用了线程A的Join()方法，直到线程A执行完毕后，才会继续执行线程B。
*  If thread A's Join () method is called in thread B, thread B will not continue to execute until thread A finishes executing.
* */
public class ThreadJoin implements Runnable{
    private String name;
    public ThreadJoin(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(name+" : "+i);
        }
    }

    public static void main(String[] args) {
        ThreadJoin tj=new ThreadJoin("A");
        Thread t1=new Thread(tj);
        t1.start();
        for (int i = 0; i <20 ; i++) {
            if(i==10){//当i=10的时候 main线程停止执行
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Main Thread: "+i);
        }
    }
}

