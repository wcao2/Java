package cn.ascending.test09ArrayList;

import java.util.ArrayList;

public class Demo03Wrapper {
    /*
    * if I want to ArrayList to save primitive data type, I need to use basic type wrapper(包装类 java.lang 不需要导包)
    *  (byte Byte) (short Short) (int Integer) (long Long) (float Float) (double Double) (char Character) (boolean Boolean)
    * After JDK 1.5,支持自动装箱，自动拆箱
    *  autoboxing:基本类型==>包装类型(type wrapper)
    *  unboxing: 包装类型==>基本类型
    */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(199);
        list.add(200);
        System.out.println(list.get(1));
    }
}
