package cn.ascending.test22WrapperClass;

/*
*  基本(primitive)类型数据 使用起来非常方便 但是没有对应的方法操作这些基本类型数据
*  可以使用一个类 把基本类型数据装起来 这个类叫做包装类 可以使用类中的方法 来操作这些基本类型的数据
* */
public class Demo01WC {
    public static void main(String[] args) {
        //装箱Boxing:基本数据类型 包装到包装类中
        //1:构造方法一个新分配的Integer对象 它表示指定的int值
        Integer in1=new Integer(1);
        //2:构造方法二
        Integer in2=new Integer("1");//传递的字符串 否则会抛出异常
        System.out.println(in2);
        //3: 静态方法
        Integer in3=Integer.valueOf(1);
        System.out.println(in3);
        Integer in4=Integer.valueOf("1");
        System.out.println(in4);

        //拆箱UnBoxing:在包装类型中 取出基本类型数据
        int i = in1.intValue();
        System.out.println(i);

    }

}
