package cn.ascending.test07oop;

/*
*  1: Local variable: define at the method inner; only can be used in the method; do not have default value
*  2: instance variable: define outside the method; used in the class, all class could use it; have the default value
*  另外: 局部变量位于栈内存，成员变量位于堆内存
*   局部变量随着方法进栈而产生，方法出栈而消失
*   成员变量随着对象创建而产生，随着对象被垃圾回收而消失
*/
public class Demo05 {
    static int[] array;//instance variable

    public static void main(String[] args) {
        System.out.println(array);//null
    }
}
