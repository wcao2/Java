package cn.ascending.test02;

//static method belong to class
public class StaticMethod {
    int num;
    static int numStatic;
    public void m1(){
        //normal method can call normal var and static var
        System.out.println(num);
        System.out.println(numStatic);
        System.out.println("this is a normal method");
    }

    public static void m2Static(){
        //static method only can call static variable
        System.out.println(numStatic);
        System.out.println("this is a static method");
    }
}

class TestStatic{
    public static void main(String[] args) {
        StaticMethod sm=new StaticMethod();
        sm.m1();
        //for static method, can use obj name to call the method or just use class name to call the method
        sm.m2Static();//not recommend( compile first convert it to StaticMethod.m2Static() )
        StaticMethod.m2Static();
        //just use method name to call the inner method
        TestStatic.myMethod();
    }

    public static void myMethod(){
        System.out.println("this is the inner method");
    }
}
