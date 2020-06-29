package cn.ascending.test20System;


import java.util.Arrays;

/*
*  java.lang.System类中提供了大量的静态方法 可以获取和系统相关的信息或系统级操作 常用的方法有
*  1: public static long currentTimeMillis() 返回以毫秒为单位的当前时间
*  2: public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):将数组中指定数据拷贝到另一个数组中
*    src:原数组 srcPos:原数组起始位置 dest:目标数组 destPos:目标数组起始位置 length:要复制的数组元素数量
* */
public class test20System {
    public static void main(String[] args) {
        democurrentTimeMillis();
        System.out.println("----------------------------------");
        demoarraycopy();
    }


    private static void democurrentTimeMillis() {
        //before the program, get the mills
        long before=System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long after=System.currentTimeMillis();
        System.out.println("the program totally costs "+(after-before)+" million seconds");
    }


    private static void demoarraycopy() {
        //define Array
        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.out.println("before copy "+ Arrays.toString(dest));
        //使用system中的arraycopy把原数组的前三个元素复制到目标数组的前三个位置上
        System.arraycopy(src,0,dest,2,3);
        System.out.println("after copy "+ Arrays.toString(dest));
    }
}
