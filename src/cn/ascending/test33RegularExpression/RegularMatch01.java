package cn.ascending.test33RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMatch01 {
    public static void main(String[] args) {
        //String pattern="a*b";//X*: X zero or more times
        String pattern="a.b";//. any character(only once) between a and b
        //String pattern="a\\.b";//really point between a and b
        //String pattern="Ascending$";//end of Ascending

        //String pattern ="^Ascending-[a-zA-Z]+";//Ascending-开头 a-z or A-Z one or more time
        //String pattern ="^Ascending-\\w+";//Ascending-开头 [a-z or A-Z or number] one or more time
        //String pattern ="^Ascending-\\w{1,10}";//Ascending-开头 a-z or A-Z or number, at least one time, not more than 10 times
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher("a2b    ");
        boolean b = m.matches();
        System.out.println("the b is "+b);

        splitAPIUrl("/aaa$bbb");
        System.out.println("--------------------------------------------");
        simpleDemo("This order was placed for QT3000! OK?");
    }

    public static boolean splitAPIUrl(String url){
        String pattern="^/([a-z]*)(\\$)([a-z]*)";
        Pattern p= Pattern.compile(pattern);
        Matcher m=p.matcher(url);
        if(m.find()){
            System.out.println("Find value: "+m.group(0));//all
            System.out.println("Find value: "+m.group(1));
            System.out.println("Find value: "+m.group(2));
            System.out.println("Find value: "+m.group(3));
        }else {
            System.out.println("No Match");
        }
        return m.find();
    }

    public static boolean simpleDemo(String line){
        //大小写字母或者空格出现 many times, then the number shows zero or many times final any character show zero or many times
        String pattern="([a-zA-Z ]*)(\\d+)(.*)";//This order was placed for QT3000! OK?
        //create pattern object
        Pattern r=Pattern.compile(pattern);
        //create macher object
        Matcher m=r.matcher(line);
        if(m.find()){
            System.out.println("Find value "+m.group(0));//all
            System.out.println("Find value "+m.group(1));//.... QT
            System.out.println("Find value "+m.group(2));//3000
            System.out.println("Find value "+m.group(3));// ! OK?
        }else {
            System.out.println("No Match");
        }
        return m.find();
    }
}
