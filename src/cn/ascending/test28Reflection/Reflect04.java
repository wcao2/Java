package cn.ascending.test28Reflection;

import cn.ascending.utils.Person;

import java.lang.reflect.Method;

public class Reflect04 {
    public static void main(String[] args) throws Exception{
        //获取Person的Class对象
        Class personClass= Person.class;

        //There is a eat method in Person Object
        Method eat_method=personClass.getMethod("eat");//无参方法
        Person p=new Person();
        //invoke方法需要传递真实对象以及方法实际参数列表
        //缺点 不知道这个方法是否被删除掉
        eat_method.invoke(p);//调用这个方法 对哪个对象(p)进行调用！！！！！！！！！！！！！！！！！！！！！！！！

        Method eat_method1=personClass.getMethod("eat",String.class);//一个参数方法
        eat_method1.invoke(p,"Wei Cao");

        System.out.println("==================");

        //获取所有public 修饰的方法
        Method[] methods=personClass.getMethods();
        for (Method method:methods){
            System.out.println(method);
            //获取方法名称
            String name=method.getName();
            System.out.println(name);
            System.out.println("----------");
        }

        //获取全类名
        String className=personClass.getName();
        System.out.println(className);//cn.ascending.utils.Person
    }
}
