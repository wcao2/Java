package cn.ascending.test14Poly;


/*
*  代码当中的多态性 就是父类引用指向子类对象
*  父类名称 对象名=new 子类名称();
*  接口名称 对象名=new 实现类名称();
* */
public class Demo01Ploy {
    public static void main(String[] args) {
        //左侧父类引用 指向右侧子类对象
        Fu obj=new Zi();

        //直接通过对象名称访问成员变量 看等号左边是谁 优先用谁 没有则向上找
        //子类不能覆盖重写父类成员变量
        System.out.println(obj.num);//10

        //new的是谁 运行谁的成员方法(编译看左，左边有这个方法；运行看右，右边覆盖重写了)
        System.out.println("prefer use subclass method: ");
        obj.method();
        //子类不能再用自己的方法了 methodZi
        //子类没有,往上找父类方法
        System.out.println("if subclass donot have, use father's method ");
        obj.methodFu();


        //间接通过成员方法访问成员变量 看该方法属于谁优先用谁的成员变量 没有则向上找
        //子类如果没有覆盖重写 就是父 10
        //子类覆盖重写 就是子 20
        System.out.println("call show num method: ");
        obj.showNum();//10

    }
}

class Fu /*extends Object*/{
    int num=10;

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFu(){
        System.out.println("父类独有方法");
    }

    public void showNum(){
        System.out.println(num);
    }
}

class Zi extends Fu{
    int num=20;
    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){}
}