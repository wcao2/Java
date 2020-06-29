package cn.ascending.test01.creationalDP.singleton;
//https://www.geeksforgeeks.org/singleton-class-java/
//In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
//After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created.

//当instance本身创建起来就很快
public class SingletonLazy {
    //lazy load
    private static SingletonLazy single_ins = null;
    public String s;

    //create constructor must be private
    private SingletonLazy() {
        s = "this is a String part from Singleton class";
    }

    //只有第一次调用getInstance()的时候才会创建instance,没有调用的时候 是不会创建instance的
    public static SingletonLazy getInstance() {//static method can only use static var
        if (single_ins != null) {
            return single_ins;
        }
        single_ins = new SingletonLazy();
        return single_ins;
    }
}