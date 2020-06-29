package cn.ascending.test23Collection.set;

import cn.ascending.utils.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/*
*   HashSet存储自定义类型元素 要求同名同年龄的人只能存储一次
*   必须重写hashCode和equals方法
* */
 class Demo03HashSet {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("A",12);
        Person p2=new Person("A",12);
        Person p3=new Person("B",12);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println("-----------------------------");
        System.out.println(set);
        System.out.println("-----------------------------");
        Iterator<Person> it = set.iterator();//Collection 接口中有个方法 iterator() ， 这个方法返回的是迭代器的实现类对象
        while (it.hasNext()){
            System.out.println("the element's in the list is "+it.next());
        }
    }
}

