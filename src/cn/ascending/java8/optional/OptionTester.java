package cn.ascending.java8.optional;
//https://www.runoob.com/java/java8-optional-class.html
import java.util.Optional;

//Optional类是一个可以为null的容器对象
//很多有用的方法 不需要我们进行显式进行空值检测
public class OptionTester {
    public int sum(Optional<Integer> a, Optional<Integer> b){
        System.out.println("the first parameter is present: "+a.isPresent());//false
        System.out.println("the second parameter is present: "+b.isPresent());//true
        //如果值存在 返回 否则返回默认值0
        Integer value1 = a.orElse(new Integer(0));
        Integer value2=  b.orElse(new Integer(0));
        return value1+value2;
    }

    public static void main(String[] args) {
        OptionTester ot=new OptionTester();
        Integer value1=null;
        Integer value2=new Integer(10);
        //Integer value2=null;
        Optional<Integer> a=Optional.ofNullable(value1);//允许传递null
        Optional<Integer> b = Optional.of(value2);//如果是null 抛出异常
        System.out.println(ot.sum(a,b));
    }
}
