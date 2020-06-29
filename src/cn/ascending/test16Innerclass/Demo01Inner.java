package cn.ascending.test16Innerclass;

/*
*  一个事物内部包含另外一个事物 就是一个类内部包含另外一个类
*  like 身体和心脏的关系 汽车和发动机的关系
*  1:成员内部类
*  2:局部内部类:定义在方法内部(包含匿名内部类)
* */

/*
*  外部类: public default
*  成员内部类:public protected default private
*  局部内部类:什么都不写
* */


/*
* 成员内部类定义格式
* 修饰符 class 外部类名称{
*      修饰符 class 内部类名称{
*           //内用外 随意; 外用内 需要内部类对象
*       }
* }
* how to use:
* 1: 间接方式 在外部类方法中 使用内部类 然后main只是调用外部类方法
* 2: 直接方式: 外部类名称.内部类名称 对象名= new 外部类名称().new 内部类名称();
* */
public class Demo01Inner {
    public static void main(String[] args) {
        Body b=new Body();//外部类对象
        b.method();//通过外部类对象 调用外部类方法 里面间接使用内部类Heart

        System.out.println("==============");
        Body.Heart h= new Body().new Heart();
        h.beat();
    }
}
