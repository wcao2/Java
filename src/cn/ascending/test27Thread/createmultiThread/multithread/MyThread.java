package cn.ascending.test27Thread.createmultiThread.multithread;

//1 创建子类
public class MyThread extends Thread{

    //2 重写run方法
    @Override
    public void run(){
        for (int i = 0; i <20 ; i++) {
            System.out.println(getName()+" run: "+i);
        }
    }
}
