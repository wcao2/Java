package cn.ascending.test11Extends;

//Inheritance is a prerequisite for polymorphism
//override:在继承关系中　方法名称一样　参数列表也一样(方法覆盖　覆写)

/*
    直接通过[子类对象]访问成员变量:等号左边是谁　优先用谁　没有则向上找　Zi zi=new Zi();
    间接通过成员方法访问成员变量:该方法属于谁 优先用谁的成员变量 没有则向上找
*/


//overload:方法名称一样　参数列表不一样
//子类方法的返回值范围必须小于父类方法的返回值范围
//子类方法的权限必须大于等于父类方法的权限修饰符　public>protected>default>private
//子类构造方法有一个默认隐含的super()调用　所以一定要先调用父类构造　后执行子类构造
public class Demo01ext {
    public static void main(String[] args) {
//        System.out.println("==================================below is ZI");
//        Zi zi=new Zi();
//        System.out.println(zi.num);
//        zi.test1();
//        zi.method();
//        zi.showNum();
        System.out.println("==================================below is FU");
        Fu fu=new Zi();//20
        System.out.println(fu.num);//30
        fu.method();//because the Zi class override the method class, so in here, it calls subclass's method and print "subclass method...."
    }
}
