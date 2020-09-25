package cn.ascending.test01.creationalDP.singleton;

public class  SingletonDesignPattern {
    //psvm
    //sout
    //ctrl+alt+l geshihua
    //IN oop,singleton class is a class that can have only one object(an instance of the class)
    //After first time, if I try to instantiate the singleton class, the new var also points to the first instance created
    //So whatever changes do to any var inside the class through any instance, it affects the variable of single instance created
    public static void main(String[] args) {
        // In the Singleton class, when we first time call getInstance() method,
        // it creates an object of the class with name single_instance and return it to the variable(a,b)
        SingletonLazy a = SingletonLazy.getInstance();
        System.out.println(a);
        //variables b is pointed to what object a is pointed
        SingletonLazy b = SingletonLazy.getInstance();
        System.out.println(b);
        //change variable of instance of a, that is reflected when we access the variables of objects b
        a.s = (a.s).toUpperCase();
        System.out.println("string from a is " + a.s);
        System.out.println("string from b is " + b.s);

        SingletonEager c = SingletonEager.getInstance();
        System.out.println(c);
        SingletonEager d = SingletonEager.getInstance();
        System.out.println(d);

    }
}


//单列模式优点