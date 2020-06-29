package cn.ascending.test22WrapperClass;

import java.util.ArrayList;

/*
*  自动拆箱和装箱 基本类型数据和包装类数据之间可以自动的相互转换
* */
public class Demo02AutoWC {
    public static void main(String[] args) {
        //Auto Boxing
        Integer in=1;//直接把int类型的整数复制给包装类 等于 Integer in=new Integer();
        //Auto UnBoxing
        in=in+2;//in是包装类 无法直接参与运算 可以自动转换为基本数据类型 再进行计算 等于 in.intValue()+2 再自动装箱

        //ArrayList无法直接存储整数 但是可以存储Integer包装类
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);//auto Boxing
        int a=list.get(0);//自动拆箱  等于 list.get(0).intValue();
    }
}
