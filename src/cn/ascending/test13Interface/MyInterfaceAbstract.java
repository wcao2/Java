package cn.ascending.test13Interface;


/*
*  1:接口用来定义抽象方法
* 　public abstract 返回值类型　方法名称(参数列表);  接口中的抽象方法　修饰符必须是两个固定的关键字　public abstract, 但可以省略(1,1,2)
*
* 　接口使用三部曲
*  １:接口不能直接使用　必须有一个实现类implementation class来实现该接口　public class 实现类名称　implements 接口名称 { }
*  2:接口的实现类必须覆盖重写接口中所有的抽象方法，去掉abstract　再加上方法体　大括号
*  3:创建实现类的对象　进行使用
*  notice: 如果实现类没有重写接口中所有抽象方法，这个实现类自己必须是抽象类
 */
public interface MyInterfaceAbstract {
    /*public abstract */void methodAbs();

}

class MyInterfaceAbstractImpl implements MyInterfaceAbstract{
    @Override
    public void methodAbs() {
        System.out.println("this is my first interface method");
    }

    public static void main(String[] args) {
        MyInterfaceAbstractImpl m= new MyInterfaceAbstractImpl();
        m.methodAbs();
    }
}