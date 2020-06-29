package cn.ascending.test28Reflection;

import cn.ascending.utils.Person;

import java.lang.reflect.Constructor;

public class Reflect03 {
    public static void main(String[] args) throws Exception{
        //获取person class对象
        Class personClass= Person.class;

        //获取constructor
        //两个参数的构造函数 第一个是String类型 第二个是int类型
        Constructor constructor=personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //无参的构造函数
        Constructor constructor1=personClass.getConstructor();
        System.out.println(constructor);

        System.out.println("===================================");
        //创建对象
        Object p=constructor.newInstance("A",23);
        System.out.println(p);

        Object p1=constructor1.newInstance();
        System.out.println(p1);

        //简化空参数constructor
        Object o=personClass.newInstance();
        System.out.println(o);
    }
}
