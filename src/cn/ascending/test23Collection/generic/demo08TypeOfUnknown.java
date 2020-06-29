package cn.ascending.test23Collection.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class demo08TypeOfUnknown {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02=new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        System.out.println("================");
        printArray(list02);
        //定义的时候不能使用?
        //ArrayList<?> list03=new ArrayList<>();

    }

    //Define a method, to traverse all type of ArrayList collection
    //don't know what type the arrayList use,可以使用泛型通配符来接收数据
    public static void printArray(ArrayList<?> list){
        //遍历集合
        Iterator<?> it = list.iterator();//集合是什么类型 迭代器的泛型就是什么类型
        while(it.hasNext()){
            //it.next() function to get the element is Object type, which means it can receive any data type
            Object o=it.next();
            System.out.println(o);
        }
    }

    //上边界通配符upper bounded wildcard

    //下边界通配符lower bounded wildcard
}
