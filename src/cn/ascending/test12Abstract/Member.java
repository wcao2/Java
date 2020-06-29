package cn.ascending.test12Abstract;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String name, int money) {
        //this(); this访问本类无参构造
        super(name, money);//访问父类有参数构造方法
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随便抽取一个==>随机获取集合当中的索引编号
        int index=new Random().nextInt(list.size());// [ )
        //根据索引　从集合中删除　并且得到被删除的红包给自己
        int delta=list.remove(index);//返回被删除的钱数
        //当前成员本来多少钱
        int money=super.getMoney();
        super.setMoney(money+delta);

    }
}
