package cn.ascending.test27Thread.waitandwake;

import cn.ascending.utils.Baozi;

public class Main {
    public static void main(String[] args) {
        //创建包子对象
        Baozi bz=new Baozi();
        //创建包子铺线程 生产包子
        new BaoZiPu(bz).start();
        //创建吃货线程 吃包子
        new ChiHuo(bz).start();
    }
}

