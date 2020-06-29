package cn.ascending.test23Collection.generic;

/*
*  泛型定义在方法的修饰符和返回值之间
*  修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
*       方法体;
*  }
*  含有泛型的方法 在调用方法的时候确定泛型的数据类型 传递什么类型参数 泛型就是你什么类型
* */
public class demo06GenericMethod {
    //定义含有泛型的普通方法
    public <M> void method1(M m){
        System.out.println(m);
    }

    //定义含有泛型的静态方法
    public static <S> void method2(S s){
        System.out.println(s);
    }
}

class demo0601GenerateMethod{
    public static void main(String[] args) {
        demo06GenericMethod dgm=new demo06GenericMethod();
        //调用含有泛型的方法method1 传递什么类型参数 泛型就是什么类型
        dgm.method1(1);
        dgm.method1("123");
        dgm.method1(true);

        //静态方法 不建议创建对象时使用
        dgm.method2("不建议这样使用");
        //静态方法 通过类名.方法名(参数)可以直接调用
        demo06GenericMethod.method2(123);
    }
}
