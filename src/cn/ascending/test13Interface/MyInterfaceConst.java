package cn.ascending.test13Interface;

//接口中也可以定义成员变量　但是必须使用 public static final三个关键字进行修饰
//从效果上看　这其实就是接口的常量
//public static final 数据类型　常亮名称　＝　数据值;
//一旦使用final关键字　说明不可改变
//接口中的常量　可以省略public static final　但是不写　也照样是这么三个
//接口中的常量　必须进行赋值
public interface MyInterfaceConst {
    /*public static final*/ int NUMBER=10;

    String str="asd";

    public default int defMethod(){
        System.out.println("this is a interface default method");
        return 1;
    }
}

class Demo01 implements MyInterfaceConst{
    public static void main(String[] args) {
        System.out.println(MyInterfaceConst.NUMBER);
    }
}
