package cn.ascending.test12Abstract;

import java.util.ArrayList;

//群主要发红包
public class Manager extends User {
    public Manager(){
        //super(); 默认
    }
    public Manager(String name,int money){
        //call father class constructor
        super(name,money);
    }

    //总共要发多少钱　多少份
    public ArrayList<Integer> send(int totalMoney,int count){
        //需要一个集合　用来存储若干个红包的金额
        ArrayList<Integer> readList=new ArrayList<>();

        //访问父类成员方法
        int leftMoney=super.getMoney();//群主当前余额
        if(totalMoney>leftMoney){
            System.out.println("余额不足");
            return readList;//返回空集合
        }
        //扣钱　重新设置余额
        super.setMoney(leftMoney-totalMoney);//访问父类成员方法
        //发红包平均拆成count份
        int avg=totalMoney/count;
        int mod=totalMoney%count;//余数,剩下的零头　包在最后一个红包

        //把红包一个个(除最后一个)放到集合中
        for (int i = 0; i < count-1; i++) {
            readList.add(avg);
        }
        int last=avg+mod;
        readList.add(last);

        return readList;
    }


}
