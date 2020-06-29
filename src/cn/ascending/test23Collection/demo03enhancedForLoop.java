package cn.ascending.test23Collection;

import java.util.ArrayList;

/*
*  增强for循环 JDK1.5之后出现的 遍历集合和数组
*  for(集合/数组数据类型 变量名:集合名/数组名){
*       sout(变量名);
*  }
*  底层也是使用iterator 简化了迭代器书写
*  所有单列集合都可以使用增强for
*
* */
public class demo03enhancedForLoop {
    public static void main(String[] args) {
        test01();
        System.out.println("=====================");
        test02();
    }

    //使用增强for循环遍历数组
    private static void test01(){
        int[] arr={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }

    //使用增强for循环遍历集合
    private static void test02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String s:list){
            System.out.println(s);
        }
    }
}
