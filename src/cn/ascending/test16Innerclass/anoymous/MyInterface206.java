package cn.ascending.test16Innerclass.anoymous;

@FunctionalInterface
public interface MyInterface206 {
    /*public abstract*/ void method();

}

class MyInterfaceImpl implements MyInterface206{
    @Override
    public void method() {
        System.out.println("实现类覆盖重写了方法");
    }
}

/*
*  匿名内部类定义格式: 接口名称 对象名=new 接口名称(){ ....覆盖所有抽象方法}
*  如果接口的实现类 或者父类的子类只需要使用唯一的一次 这种情况下 可以 省略该类的定义 而改为使用匿名内部类
* */

/*
*  1:new代表创建对象的动作
*  2:接口名称就是匿名内部类需要实现哪个接口
*  3:{...}这才是匿名内部类的内容
*  注意:
*  1: 匿名对象 在调用方法的时候 只能调用唯一一次 如果需要同一个对象调用多次方法 那么必须给对象起一个名字
*  2: 匿名内部类是省略了([实现类/子类名称]); 匿名对象是省略了对象名称
* */
class Main{
    public static void main(String[] args) {
        //接口的实现类 或者是父类的子类 只需要使用唯一的一次 这种情况下省略掉该类的定义 而使用匿名内部类
//        MyInterfaceImpl mfi=new MyInterfaceImpl();
//        mfi.method();
        //define 匿名内部类 { }=》省掉类的单独定义
        MyInterface206 obj=new MyInterface206(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法");
            }
        };
        obj.method();

       /* MyInterface206 m=()->{
            System.out.println("123");
        };
        m.method();
        m.method();*/

        //使用匿名内部类 而且省略对象名称([匿名对象])
        new MyInterface206(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法");
            }
        }.method();


    }
}
