package cn.ascending.test07oop;

import java.util.Arrays;

/*
*   面向过程: 当需要实现一个功能的时候，每一个具体步骤都要亲力亲为，详细处理每一个细节
*   面向对象: .... 找一个已经具有该功能的人来协助
* */
public class Demo01Intr {
    public static void main(String[] args) {
        int[] array={10,20,5,50,23,60};
        //要求按照升序打印
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+", ");
            }
        }

        System.out.println("=============");
        //使用面向对象
        //find a class(Arrays) provided by JDK
        //toString method,
        System.out.println(Arrays.toString(array));

        //java.util.Arrays是一个与数组相关的工具类　里面提供了大量的静态方法　用来实现数组常见的操作
        /*
         *　１: public static String toString(数组) 将参数数组变成字符串
         * ２: public static void sort(数组) 按照升序 从小到大　对数组元素排序
         */

    }
}
