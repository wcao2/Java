package cn.ascending.test06Array;

import java.lang.reflect.Array;
import java.util.Arrays;

//数组工具类147
//java.util.Array是一个与数组相关的工具类　里面提供了大量的静态方法　用来实现数组常见的操作
/*
*　１: public static String toString(数组) 将参数数组变成字符串
* ２: public static void sort(数组) 按照升序 从小到大　对数组元素排序
*/
public class Demo10ConvertToStr {
    public static void main(String[] args) {
        //将int数组变成默认格式的字符串
        int[] array={10,20,30};
        String intStr= Arrays.toString(array);//[10,20,30]
        System.out.println(intStr);

        int[] array1={2,3,1};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[1, 2, 3]


        String[] array2={"bbb","aaa","ddd"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[aaa, bbb, ddd]
    }
}
