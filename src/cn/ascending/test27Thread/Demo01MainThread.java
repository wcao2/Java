package cn.ascending.test27Thread;

import cn.ascending.utils.Person;

/*
*  执行主程序 单线程程序(java程序中只有一个进程)
*  程序是从main方法开始 从上到下 依次执行
*
*  JVM执行main方法 main方法会进入到栈内存 JVM会找os开辟一条main方法通向cpu的执行路径
*  cpu就可以通过这个路径来执行main方法 这个路径叫做 main(主)线程
* */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1=new Person("A");
        p1.run();

        Person p2=new Person("B");
        p2.run();
    }
}
