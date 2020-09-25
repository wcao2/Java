package cn.ascending.test19Date;

import java.util.Calendar;
import java.util.Date;

import static cn.ascending.test19Date.DateFormat.demo02;

/*
*   Calendar类是一个抽象类 无法直接创建对象使用 里面有一个方法getInstance() 该方法返回Calendar类的子类
* */
public class Calander01 {
    public static void main(String[] args) {
//        Calendar c1= Calendar.getInstance();//多态
//        System.out.println(c1);

        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    /*
    *  public int get(int field): 返回给定日历字段的值
    *  参数: 传递指定的日历字段(YEAR,MONTH)
    *  返回值: 日历字段代表的具体值
    * */
    private static void demo01() {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println("the year is "+year);

        int month=c.get(Calendar.MONTH);
        System.out.println("the month is "+month);

        int date=c.get(Calendar.DAY_OF_MONTH);
        int date1=c.get(Calendar.DATE);
        System.out.println("same as below "+date);
        System.out.println("same as above "+date1);
        System.out.println("----------------------------------");
    }

    /*
    *  public void set(int field, int value) 将给定的日历字段设置为给定值
    * */
    private static void demo02(){
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,1999);
        c.set(Calendar.MONTH,8);
        c.set(Calendar.DATE,9);
        //同时设置年月日
        c.set(1999,8,9);

        int year=c.get(Calendar.YEAR);
        System.out.println(year);
        int month=c.get(Calendar.MONTH);
        System.out.println(month);
        int day=c.get(Calendar.DATE);
        System.out.println(day);
        System.out.println("----------------------------------");
    }

    /*
    *  根据日历的规则 给指定的日历字段添加或者减去指定的时间量
    * */
    public static void demo03(){
        Calendar c=Calendar.getInstance();
        c.add(Calendar.YEAR,2);
        c.add(Calendar.MONTH,-1);
        int year=c.get(Calendar.YEAR);
        System.out.println(year);
        int month=c.get(Calendar.MONTH);
        System.out.println(month);
        System.out.println("----------------------------------");
    }

    /*
    *  把日历对象转换为日期对象
    * */
    public static void demo04(){
        Calendar c=Calendar.getInstance();
        Date d=c.getTime();
        System.out.println("the d is "+d);
        
    }
}
