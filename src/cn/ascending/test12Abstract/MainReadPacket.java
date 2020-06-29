package cn.ascending.test12Abstract;

import java.util.ArrayList;

public class MainReadPacket {
    public static void main(String[] args) {
        Manager m=new Manager("host",100);
        Member  one=new Member("a",0);
        Member  two=new Member("b",0);
        Member  three=new Member("c",0);

        m.show();
        one.show();
        two.show();
        three.show();
        System.out.println("======================");

        //群主总共发20块钱 分成三个红包
        ArrayList<Integer> redList=m.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        m.show();
        one.show();
        two.show();
        three.show();

    }
}
