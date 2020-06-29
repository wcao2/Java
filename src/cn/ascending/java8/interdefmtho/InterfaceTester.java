package cn.ascending.java8.interdefmtho;

@FunctionalInterface
public interface InterfaceTester {
    //default method can be override
    public default void defMethod(){
        System.out.println("this is a interface default method");
    }

    public default void defMethod01(){
        System.out.println("this is a interface default method2");
    }

    //static method
    public static void methodStatic(){
        System.out.println("this is a new static method");
    }

    //FunctionalInterface can only have one method, so default method was introduced in java8
    //abstract method
    void absMethod();
}
