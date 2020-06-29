package cn.ascending.test01.creationalDP.singleton;

//用eager load 当创建instance很耗时间,不要在getInstance的时候(runtime)才创建
public class SingletonEager {
    //eager load
    //In eager initialization, the instance of Singleton Class is created at the time of class loading

    //类将自身的构造器权限设为 private，防止外部代码创建对象，对外只提供一个静态的 getInstance() 方法，作为获取单例的唯一入口
    private SingletonEager(){}

    //一上来就创建一个instance 用final的原因是instance不会再改变了,所以getInstance()的时候 直接返回instance
    private static final SingletonEager instance=new SingletonEager();// final Thread safe

    //provide the single entry point to create the new instance of the class
    public static SingletonEager getInstance(){
        return instance;
    }


}
