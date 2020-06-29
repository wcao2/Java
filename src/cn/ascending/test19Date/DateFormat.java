package cn.ascending.test19Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*  DateFormat(子类): 是format(abstract) 的子类
*  作用: 日期-->文本(格式化) 解析(文本-->日期)
*
*   成员方法
*   String format(Date date)  按照指定的模式 把Date日期 转化为符合模式的字符串
*   Date parse(String source) 把符合模式的字符串 解析为Date日期
*
*   DateFormat是一个抽象类 无法直接创建对象使用 可以使用DateFormat类的子类SimpleDateFormat
*   构造方法 SimpleDateFormat(String pattern) 参数:传递指定的格式
*   y M d H m s
 * */
public class DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("=========");
        demo02();
    }

    //使用DateFormat类中的方法format,把日期转换为文本
    public static void demo01(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String d=sdf.format(date);
        System.out.println("本身时间: "+date);
        System.out.println("格式化后: "+d);
    }

    //使用DateFormat类中的方法parse,把文本解析为日期
    public static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse("2020-04-04 13:55:18");
        System.out.println(date);
    }
}
