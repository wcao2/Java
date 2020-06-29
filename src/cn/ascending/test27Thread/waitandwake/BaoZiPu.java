package cn.ascending.test27Thread.waitandwake;

import cn.ascending.utils.Baozi;

/*
*  包子铺和吃货线程关系 互斥(Mutually exclusive) 必须保证两个线程只有一个在执行
*  锁对象必须保证唯一 可以使用包子对象作为锁对象
*  包子铺和吃货类必须把包子对象作为参数传进来
* */
public class BaoZiPu extends Thread{
    // 1:成员位置创建一个包子变量
    private Baozi bz;

    //2:使用带参数构造方法 为包子变量赋值
    public BaoZiPu(Baozi bz){
        this.bz=bz;
    }

    //设置线程任务run 生产包子
    @Override
    public void run() {
        int count=0;
        //让包子铺一直生产包子 否则只生产一个
        while (true){
            //同步技术确保两个线程只有一个在执行
            synchronized (bz){
                //对包子状态进行判断
                if(bz.flag==true){//true:有包子
                    //包子铺调用wait方法进入等待状态(让人吃包子)
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后(因为没包子了) 生产包子
                if(count%2==0){
                    //生产肉馅薄皮包子
                    bz.pi="薄皮";
                    bz.xian="肉";
                }else {//这两个轮流交替生产
                    bz.pi="厚皮";
                    bz.xian="素";
                }
                count++;
                System.out.println("包子铺正在生产包子:"+bz.xian+bz.pi+" and the ranking of 包子 is "+count);
                //生产包子需要三秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=true;
                //唤醒吃货线程 吃包子
                bz.notify();
                System.out.println("已经造好了 "+bz.pi+bz.xian+" 可以开吃");
            }
        }
    }
}
