package cn.ascending.test28Reflection;

import cn.ascending.utils.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
*  写一个"框架" 在不改变任何代码的前提下 创建任意类对象 并且执行其中任意方法
*   借助1配置文件 2反射
*   step1:将需要创建对象的全类名和需要执行的方法定义在配置文件中
*   step2:在程序中加载配置文件
*   step3:使用反射技术加载类文件进内存
*   step4:创建对象
*   step5:执行方法
* */
public class ReflectEnd {
    public static void main(String[] args) throws Exception {
        //可以创建任意类对象 执行任意方法
       /* Person p=new Person();
        p.eat();*/

        //1:加载配置文件
        //1.1:创建Properties对象
        Properties pro=new Properties();
        //1.2加载配置文件 转换为集合
        //1.2.1获取ReflectEnd字节码文件对应的类加载器
        ClassLoader classLoader = ReflectEnd.class.getClassLoader();
        InputStream is=classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2获取配置文件中定义的数据
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");

        //3加载该类进内存
        Class cls=Class.forName(className);
        //4创建对象
        Object obj=cls.newInstance();
        //5获取方法对象
        Method method=cls.getMethod(methodName);
        //6执行方法
        method.invoke(obj);
    }
}
