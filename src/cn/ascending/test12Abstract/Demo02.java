package cn.ascending.test12Abstract;

//抽象类不一定有抽象方法
//抽象类的子类必须重写所有抽象方法　否则子类也要是抽象类
public abstract class Demo02 {
    public Demo02(){
        System.out.println("contructor method of father");
    }
    public abstract void eat();
}

class Zi extends Demo02{
    public Zi(){
        super();//默认调用
        System.out.println("constructor method of son");
    }

    @Override
    public void eat() {
        System.out.println("eat sth");
    }

    public static void main(String[] args) {
        Zi z=new Zi();
        z.eat();
    }
}
