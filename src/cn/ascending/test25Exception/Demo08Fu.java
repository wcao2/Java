package cn.ascending.test25Exception;

public class Demo08Fu {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}

class Zi extends Demo08Fu{
    //子类重写父类方法时,抛出和父类一样的异常
    public void show01() throws NullPointerException,ClassCastException{}
    //子类重写父类方法时,抛出和父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    //子类重写父类方法时,不抛出异常
    public void show03(){}
    //父类没有抛出异常 子类重写父类方法时候 也不可以抛出异常 若子类有异常 只能捕获处理try catch 不能声明抛出throws
    public void show04(){}

}
