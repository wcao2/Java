package cn.ascending.test27Thread;
//https://www.geeksforgeeks.org/java-thread-priority-multithreading/
public class ThreadPriority extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(getName()+" run: "+i);
        }
    }

    //default thread priority is 5;Thread with highest priority will get execution chance prior to other threads
    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority();
        ThreadPriority t2=new ThreadPriority();
        t1.setPriority(8);
        t2.setPriority(1);
        //Main Thread priority is set to 7
        Thread.currentThread().setPriority(9);
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" run: "+i);
        }

        t1.start();
        t2.start();

        System.out.println("t1 priority is "+t1.getPriority());
        System.out.println("t2 priority is "+t2.getPriority());
        System.out.println("current Thread priority "+Thread.currentThread().getPriority());
    }
}


