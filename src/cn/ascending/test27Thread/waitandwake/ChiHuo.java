package cn.ascending.test27Thread.waitandwake;

import cn.ascending.utils.Baozi;

public class ChiHuo extends Thread{
    // 1:成员位置创建一个包子变量
    private Baozi bz;
    //2:使用带参数构造方法 为包子变量赋值
    public ChiHuo(Baozi bz){
        this.bz=bz;
    }
    //设置线程任务 吃包子

    @Override
    public void run() {
        //设置死循环 一直吃包子
        while (true){
            //必须同时用同步技术保证两个线程只有一个在执行
            synchronized (bz){
                //对包子状态判断
                if(bz.flag==false){//没包子了
                    //吃货进入wait方法等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //唤醒之后 吃包子
                System.out.println("吃货开始吃: "+bz.pi+bz.xian);
                //吃完修改flag
                bz.flag=false;
                //唤醒包子铺
                bz.notify();
                System.out.println("吃货已经把: "+bz.pi+bz.xian+"吃完了");
                System.out.println("-------------------------------------");
            }
        }
    }
}
