package cn.ascending.test13Interface;

//https://www.youtube.com/watch?v=h4gOYLx7VJ4&list=PLD3Xyx6ef38yAdTNXD7ntDlaarf8NEoZ4&index=175
//175

/*
* 1:java8　开始　接口里允许定义 [默认方法]
* 　public default 返回值类型　方法名称(参数列表){ 方法体 }
*  默认方法　可以通过接口实现类对象直接调用 ; 也可以通过接口实现类进行覆盖重写
*
* 2: java8 开始，　接口中允许定义 [静态方法]
* 　　public static 返回值类型　方法名称(参数列表){ 方法体}　把abstract, default换成static即可
 */
public interface MyInterfaceDefault {
    //抽象方法
   /* public abstract */void methodAbs();

    //新添加一个默认方法 (just do not want to modify implementation class)
    public default void methodDefault(){
        System.out.println("this is a new default method");
    }

    //这个接口的静态方法
    public static void methodStatic(){
        System.out.println("this is a new static method");
    }
}

//default will be extends by the implementation class
class Main implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("implementation the abstract method");
    }

/*    @Override
    public void methodDefault(){
        System.out.println("实现类覆盖重写了接口的默认方法");
    }*/
/*    @Override
    public void methodDefault(){
        System.out.println("实现类覆盖重写了接口的默认方法");
    }*/

    public static void main(String[] args) {
        Main m=new Main();
        m.methodAbs();
        m.methodDefault();
        //不能通过接口的实现类调用接口中静态方法　应该通过接口名称直接调用静态方法
        MyInterfaceDefault.methodStatic();
    }
}
