package cn.ascending.test14Poly.Demo02;


/*
 *  在多态的代码中 成员方法的访问规则是 看new的是谁 就优先用谁 没有则向上找
 */
public class Demo02 {
    public static void main(String[] args) {
        Fu obj=new Zi();//多态
        System.out.println(obj.num);//这里优先父
        obj.method();//new Zi() so 优先用Zi
        obj.methodFu();//子类没有父类有 用父
        
    }
}

class Fu{
    int num=10;

    public void showNum(){
        System.out.println(num);
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFu(){
        System.out.println("父类特有方法");
    }
}

class Zi extends Fu{
    int num=20;
    int age=16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}