package cn.ascending.test11Extends;

public class Zi extends Fu {

    //super的父类构造方法调用，必须是子类构造方法的第一个语句　而且只能调用一个构造方法
    //只有子类构造方法里面　才能调用父类构造方法
    public Zi(){
        //super();//默认调用父类无参构造方法
        //super用法３
        super(20);//调用父类重载的构造方法　　有参数和无参数只能用一个
        System.out.println("子类构造方法");

    }

    public Zi(int n){
        this();//this用法４:本类的有参构造调用本类的无参构造　也必须是第一个语句
        //super用法2: 在子类成员方法中，访问父类成员变量
        System.out.println(super.num);
    }

    @Override
    public void method() {
        //override Fu method
        //super.method();//super用法１:在子类成员方法中，访问父类成员方法
        System.out.println("subclass method....");
    }

    //this 作用
    int num=20;
    public void showNum(){
        int num=10;
        System.out.println(num);//１:局部变量 local variable   10
        System.out.println(this.num);//2:本类中成员变量  20
        System.out.println(super.num);//3:父类中成员变量   30
        this.test1();//4:访问本类中另外一个成员方法(instance function)
    }
    public void test1(){
        System.out.println("BBB");
    }
}
