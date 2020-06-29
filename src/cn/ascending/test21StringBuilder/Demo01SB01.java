package cn.ascending.test21StringBuilder;

import java.util.Objects;

/*
*  StringBuilder类：可以提高字符串的操作效率 可以看成一个长度可变的字符串 底层是一个数组 没有被final修饰
*                初始长度是16  在内存中始终是一个数组 占用空间少 效率高 如果超出容量 会自动扩容
*
*  String:进行字符串相加，内存中就会有多个字符串 占用空间多 效率低下(Occupy more space, inefficient) 底层是一个被final修饰过得数组 不能改变 是const
*
    * StringBuffer was the only choice for String manipulation till Java 1.4 but it has one disadvantage
    * that all of its public methods are synchronized. StringBuffer provides Thread safety but on a performance cost.
*
* */
public class Demo01SB01 {
    //java.lang.StringBuilder
    //constructor
    // 1：StringBuilder() 构造一个不带任何字符的字符创生成器 其初始容量为16个字符
    //2: StringBuilder(String str) 构造一个字符串生成器 并初始化指定的字符串内容
    //instance method
    //1: public StringBuilder append(): 添加任意类型的数据的字符串形式 并返回当前对象本身
    //2: toString()
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println("sb1: "+sb1);//sb1: ""

        //带字符串的方法
        StringBuilder sb2=new StringBuilder("abc");
        System.out.println("sb2: "+sb2);//sb2:abc

        StringBuilder sb3=sb1.append("def");//sb1自动加上
        System.out.println(sb3);
        System.out.println(sb1);
        System.out.println(sb1==sb3);//添加任意类型的数据的字符串形式 并返回当前对象本身 so true

        //使用append()方法无需接收返回值
        StringBuilder sb4=new StringBuilder();
        sb4.append(1);
        sb4.append(true);
        sb4.append(8.8);
        sb4.append('a');
        sb4.append("hello world");
        System.out.println("sb4  "+sb4);

        //链式编程(Chain programming):方法返回值是一个对象 可以继续调用方法
        System.out.println("abc".toUpperCase().toLowerCase());
        sb4.append("the wordld peace").append(123).append("WEi Cao");

        //StringBuilder和String之间可以相互转换
        //1:String->StringBuilder:可以使用StringBuilder的构造方法  StringBuilder sb2=new StringBuilder("abc");
        String str="hello";
        System.out.println("str: "+str);
        StringBuilder sb5=new StringBuilder(str);// 构造一个字符串生成器 并初始化指定的字符串内容
        sb5.append("world");
        System.out.println("sb5: "+sb5);
        //2:StringBuilder->String :可以StringBuilder中的toString方法
        String s=sb5.toString();
        System.out.println("s: "+s);

    }
}
