package cn.ascending.test19Date;

import java.util.Date;

public class DateMethods {
    public static void main(String[] args) {
        demo01();
        System.out.println("----------------------------------");
        demo02();
        System.out.println("----------------------------------");
        demo03();
    }

    /*
    *  Date类空参数构造方法1 用来获取当前系统的日期和时间
    * */
    private static void demo01(){
        Date date=new Date();
        System.out.println(date);//重写toString()方法 打印当前系统时间和日期
    }

    /*
    *  Date类带参数构造方法2; Long类型(毫秒值) 把毫秒值转换为Date日期
    * */
    private static void demo02(){
        Date date=new Date(0L);
        System.out.println(date);
    }

    /*
    *  Date类成员方法 Long getTime() 把日期转换为毫秒值 相当于 System.currentTimeMillis() 方法
    * */
    private static void demo03(){
        Date date=new Date();
        long time=date.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());//same as above

    }

}
