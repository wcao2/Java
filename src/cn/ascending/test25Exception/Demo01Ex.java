package cn.ascending.test25Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*  exception is not syntax error, if it is se, compile can not be passed
*  java.lang.Throwable: 类是Java语言中所有错误或者异常的超类
*           Exception: 编译期异常，进行编译java程序时出现的问题(可以解决)
*                   RuntimeException:运行期异常 java程序在运行的过程中发生的问题
*           Error:错误(无法解决，必须修改源代码 程序才能继续执行)
*
* */
public class Demo01Ex {
    public static void main(String[] args) /*throws ParseException*/ {//jvm solve the ex, stop the process, and print the ex in console
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");//用来格式化日期、
//        Date date= null;
//        try {//可能会出现异常的代码
//            date = sdf.parse("1999-09-09");//把字符串格式的日期 转换为date格式的日期
//        } catch (ParseException e) {
              //异常处理的逻辑
//            e.printStackTrace();
             //Sout(e);
//        }
//        System.out.println(date);
    }
}
