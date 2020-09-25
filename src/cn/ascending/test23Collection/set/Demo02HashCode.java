package cn.ascending.test23Collection.set;

import java.util.HashSet;

/*
*  hashvalue: 是一个十进制的整数 由系统随机给出 就是对象的一个地址值 是一个逻辑地址 是模拟出来的地址 不是数据实际存储的物理地址值
*   It is a integer randomly given by the system, it is an address value of the object which is a logical address
*   and it is the simulated address and it is not the physical address value of the actual data storage
*
* */
public class Demo02HashCode {
    public static void main(String[] args) {
        Demo01set ds1=new Demo01set();
        int h1=ds1.hashCode();
        System.out.println("hashcode of h1 "+h1);

        Demo01set ds2=new Demo01set();
        int h2=ds2.hashCode();
        System.out.println("hashcode of h2 "+h2);

        System.out.println("======================");
        //字符串类重写了Object类的hashcode方法
        String s1=new String("anc");
        String s2=new String("anc");
        System.out.println(s1.toString());//anc
        System.out.println(s2.toString());//anc
        System.out.println(s1.hashCode());//96726
        System.out.println(s2.hashCode());//96726

        System.out.println("======================");
        HashSet<String> set=new HashSet<>();
        String str1=new String("abc");
        String str2=new String("abc");
        set.add(str1);
        set.add(str2);
        System.out.println(str1.hashCode()==str2.hashCode());//true
        System.out.println(str1.equals(str2));//true
        for(String i:set){
            System.out.println(i);//abc
        }
        //set再调用add方法的时候，add方法会调用元素的hashCode方法和equals方法， 判断元素是否重复
        //add方法会调用s2的hashCode方法 计算字符abc的哈希值96354， 在集合中找有没有96354的哈希值 如果有 哈希冲突
        //s2会调用equal方法和哈希值相同的元素进行比较 s2.equals(s1) 返回true 两个元素的哈希值一样 认定两个元素相同 str2就会替代s1存储到集合中
    }
}
