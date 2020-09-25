package cn.ascending.test12Abstract;

//如果父类中的方法不确定如何实现　这就应该是一个抽象方法
//抽象方法所在的类必须是抽象类　在class之前写上abstract
//如果子类没有实现全部抽象方法 子类也必须是抽象类

public abstract class Demo01Abs {

    public abstract void eat();


    //this is normal instance method
    public void method(){

    }
}

//1:不能直接创建抽象类对象
//2:必须用一个子类继承抽象类
//3:子类必须覆盖override抽象父类中所有的抽象方法(去掉abstract,补上方法体{})
//4:创建子类对象　进行使用
class Main extends Demo01Abs{
    @Override
    public void eat() {
        System.out.println("override....");
    }

    public static void main(String[] args) {
        Main m=new Main();
        m.eat();
        //m.method();
    }
}
