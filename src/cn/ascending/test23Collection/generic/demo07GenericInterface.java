package cn.ascending.test23Collection.generic;

//定义含有泛型的接口
public interface demo07GenericInterface<I> {
    public abstract void method(I i);
}

//含有泛型的接口 实现方式1: 定义接口的实现类 实现接口 指定接口的泛型
class demo07GenericInterfaceImpl1 implements demo07GenericInterface<String>{
    @Override
    public void method(String str) {
        System.out.println(str);
    }

}

//含有泛型的接口 实现方式2: 接口使用什么泛型 实现类就使用什么泛型 类跟着接口走 相当于定义一个含有泛型的类 创建对象的时候确定泛型的类型
class demo07GenericInterfaceImpl2<I> implements demo07GenericInterface<I>{

    @Override
    public void method(I i) {
        System.out.println(i);
    }
}

class main{
    public static void main(String[] args) {
        demo07GenericInterface impl1=new demo07GenericInterfaceImpl1();
        impl1.method("abs");
        impl1.method(true);//ClassCastException
        System.out.println("------------------");
        demo07GenericInterface<Double> impl2=new demo07GenericInterfaceImpl2();
        impl2.method(1.00);
    }
}