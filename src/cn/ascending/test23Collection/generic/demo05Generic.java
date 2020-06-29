package cn.ascending.test23Collection.generic;

import cn.ascending.utils.Person;

import java.util.ArrayList;
import java.util.Iterator;

/*
*  泛型是一种未知的数据类型(unknown data type) 当我们不知道是用什么数据类型的时候 可以使用泛型
*  泛型也可以看成是一个变量 用来接收数据类型
*  ArrayList集合在定义的时候 不知道都会存储什么类型的数据 所以类型使用泛型
*  创建集合对象的时候 就会确定泛型的数据类型 ArrayList<String> list=new ArrayList<String>();
* */
public class demo05Generic {
    public static void main(String[] args) {
        show01();
       // show02();
    }

    //创建集合对象 不使用泛型 默认的类型 就是object类型 可以存储任意类型数据
    //弊端 和引发异常 ClassCastException转换异常
    private static void show01(){
        ArrayList list=new ArrayList<>();
        list.add("abc");
        list.add(1);
        //迭代器遍历list集合
        //1:获取迭代器
        Iterator it = list.iterator();
        //2:使用迭代器中的方法hasNext和next遍历集合
        while(it.hasNext()){
            //3:取出元素
            Object obj=it.next();
            System.out.println(obj);

            //want to use length method in String object,不能使用 因为 Object obj="abc";
            //所以要downcasting 向下转型 downcasting
            String s=(String)obj;
            //ClassCastException转换异常 不能把Integer类转换为String类型
            System.out.println(s.length());
        }
    }

    //创建集合对象 使用泛型
    //1:优点:避免了类型转换(type conversion)的麻烦 存储的是什么类型 取出的就是什么类型
    //2:缺点:泛型是什么类型 就只能存储什么类型的数据
    private static void show02(){
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        //list.add(1);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s+"-->"+s.length());
        }
    }
}
