package cn.ascending.test18equals;

import java.util.ArrayList;

public class Demo01Equals {
    public static void main(String[] args) {
        Person p1=new Person("A",12);
        Person p2=new Person("B",19);
        //基本数据类型 比较的是值; 引用数据类型 比较的是两个对象的地址值
        boolean b=p1.equals(p2);//false
        System.out.println(b);
        p1=p2;//把p2的值赋值给p1
        boolean b1=p1.equals(p2);//true
        System.out.println(b1);
        System.out.println(p1.name.equals(p2.name));//true

        ArrayList<String> list= new ArrayList<>();
        boolean b2=p1.equals(list);//ClassCastException
        System.out.println("b2------->"+b2);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //比较两个对象的地址值 没有意义; 所以要重写equals方法 比较两个对象的属性
    @Override
    public boolean equals(Object obj){
        //增加一个判断1 如果传递的是本身自己(this) 直接返回true,提高程序效率
        if(obj==this) return true;

        //增加一个判断2 如果传递的参数是null 直接返回false,提高程序效率
        if(obj==null) return false;

        //增加一个判断3 防止类型转换异常 (如果obj是Person类型)
        if(obj instanceof Person){
            //downcasting(向下转型),把obj转换为person类型
            Person p=(Person)obj;
            boolean b=this.name.equals(p.name) && this.age==p.age;
            return b;
        }
        //如果不成立
        return false;
    }
}