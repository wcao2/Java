package cn.ascending.test23Collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/*
*  java.util.set 接口 继承 Collection接口
*  1:不许存储重复元素
*  2:没有索引 没有带索引的方法 也不能使用普通的for循环遍历
*  3: hashset实现set接口 底层是一个hashtable 查询速度非常快
* */
public class Demo01set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        //使用add方法 往集合中添加元素
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        //不能使用普通for循环 因为没有索引 所以使用迭代器
        Iterator<Integer> it = set.iterator();//Collection 接口中有个方法 iterator() ， 这个方法返回的是迭代器的实现类对象
        while (it.hasNext()){
            Integer n=it.next();
            System.out.println("use iterator to traverse "+n);
        }
        System.out.println("--------------------");
        //使用增强for
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
