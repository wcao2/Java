package cn.ascending.test28Reflection;

import cn.ascending.utils.Person;

import java.lang.reflect.Field;

public class Reflect02 {
    /*
    *
    * */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取person class对象
        Class personClass=Person.class;
        //1:获取所有instance variable(public修饰的)
        Field[] fields=personClass.getFields();
        for(Field f:fields){
            System.out.println(f);//only a is public, name, age are private
        }
        System.out.println("------------------");
        Field a=personClass.getField("a");//获取指定的public instable variable
        System.out.println("a is "+a);

        //2:成员变量的操作
        //获取成员变量a的值
        Person p=new Person();
        Object value=a.get(p);
        System.out.println("before value is "+value);
        //设置成员变量a的值
        a.set(p,"hello");
        System.out.println("after value is "+a.get(p));

        System.out.println("==================");

        //getDeclared fields 获取所有成员变量 不考虑修饰符
        Field[] declaredFields=personClass.getDeclaredFields();
        for(Field declaredField:declaredFields){
            System.out.println(declaredField);
        }
        //获取单个
        Field age=personClass.getDeclaredField("age");
        //!!!!忽略访问权限修饰符的安全检查 due to age is private in Person
        age.setAccessible(true);//暴力反射
        Object value1=age.get(p);
        System.out.println("age is "+value1);
        System.out.println("------------------");
    }
}
