package cn.ascending.test08oopext;
import cn.ascending.utils.Person;

public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection gc=new GarbageCollection();

        //1:Nullifying the reference variable, then gc will Automatically clear it from memory
        gc=null;
        //2: in general, we put our variable in a method, a variable is called local variable, in the method,
        // after called, the variable will be cleared by the garbage collection
        //conclusion: it is better to use local variable compared with instance variable(only object be cleared by gc, the iv will be removed)

        //3: Re-assigning the reference variable
        Person p1 = new Person();
        Person p2=new Person();
        p2=p1;//then new Person() in p2 will be gc
        //4:
    }
}
