package cn.ascending.test28Reflection;

import cn.ascending.utils.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectRyo {
    public static void main(String[] args) throws Exception {
        Person person=new Person();
        Class cls = person.getClass();
        System.out.println("The name of the class is "+cls);
        System.out.println("The name of the class is "+cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("THe name of the constructor is "+constructor);
        System.out.println("THe name of the constructor is "+constructor.getName());
        System.out.println("----------------------------------------------");

        //GET ALL THE METHOD  (getDeclaredMethods)
        Method[] methods = cls.getMethods();
        for(Method m:methods){
            System.out.println("the name of the method is "+m.getName());
        }
        System.out.println("----------------------------------------------");

        //get fields(even private)
        Field field = cls.getDeclaredField("name");
        field.setAccessible(true);
    }
}
