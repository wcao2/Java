package cn.ascending.test23Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 迭代器是通用的取出集合中元素的方法
*
*  java.util.Iterator 接口(对集合进行遍历)
*  有两个常用的方法:
*  1: hasNext():如果有元素可以迭代 返回true
*  2: next():返回迭代的下一个元素
*
*  Iterator 迭代器是一个接口 无法直接使用 需要使用Iterator接口的实现类对象
*  Collection 接口中有个方法 iterator() ， 这个方法返回的是迭代器的实现类对象
*
*  1:使用集合中的方法iterator() 获取迭代器的实现类对象，使用Iterator接口接收(多态)
*  2: 使用Iterator接口中的方法hasNext()去判断还有没有下一个元素
*  3: 使用接口Iterator中的方法next去取出集合中的下一个元素
* */
public class demo02Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll=new ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        coll.add("D");
        /*
        *  迭代器Iterator<E> 接口是有泛型的 迭代器的泛型跟着集合走 集合是什么类型 迭代器就是什么泛型
        * */
        //多态 ==>  接口= 返回的是实现类对象,并且指针指向集合的-1索引
        Iterator<String> it = coll.iterator();//Collection 接口中有个方法 iterator() ， 这个方法返回的是迭代器的实现类对象
        /*boolean b=it.hasNext();
        System.out.println("集合中是否有元素: "+b);
        String s = it.next();
        System.out.println(s);*/

        while(it.hasNext()){
            String e=it.next();
            System.out.println("集合中的元素: "+e);
        }
        System.out.println("===================");
        for(Iterator<String> it2=coll.iterator();it2.hasNext();){
            String e=it2.next();
            System.out.println("集合中的元素: "+e);
        }
    }
}
