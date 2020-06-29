package cn.ascending.test28Reflection;

import cn.ascending.utils.Person;

public class Reflect01 {
    /*
    *  获取class类对象三种方式
    *  把Person.class加载进内存中对应的class类对象是同一个
    * */
    public static void main(String[] args) throws Exception {
        //1:Class.forName("全类名")
        Class cls1= Class.forName("cn.ascending.utils.Person");//fullname(package name+class name)
        System.out.println(cls1);
        //2:类名.class:通过类名的class属性获取
        Class cls2= Person.class;
        System.out.println(cls2);
        //3:对象.getClass(): getClass()方法在Object类中定义
        Person p=new Person();
        Class cls3=p.getClass();
        System.out.println(cls3);

        //同一个字节码文件*.class在一次程序运行过程中 只会被加载一次 无论通过哪一种方式获取Class类对象都是同一个
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
    }
}
