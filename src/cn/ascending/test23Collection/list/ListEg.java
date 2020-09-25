package cn.ascending.test23Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
*  1:有序的集合 存储和取出元素的顺序是一致的
*  2:有索引 包含一些带索引的方法
*  3: 允许存储重复元素
* */
public class ListEg {
    public static void main(String[] args) {
        //创建一个list集合对象
        List<String> list=new ArrayList<>();
        //1:a集合中添加元素
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);//已经不是地址值 重写toString()方法 [b, b, c, d]
        System.out.println(list.toString());//same as above
        //1:b集合中添加元素 特有方法 在指定位置添加元素
        //在cd 之间添加一个元素e
        list.add(3,"e");
        System.out.println("after add e, the list is "+list);
        System.out.println("======================");

        //2:移除元素
        String removeE=list.remove(0);//remove first one
        System.out.println("the remove element is "+removeE);
        System.out.println(list);
        System.out.println("======================");
        //3:替换元素
        String setE=list.set(0,"a");//set 被替换的元素  replace the first element with a
        System.out.println("the replaced element is "+setE);
        System.out.println(list);
        System.out.println("======================遍历集合的几种方式");

        //list集合遍历有三种方式
        //1:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------");
        //2:
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("----------------------");
        //3: enhanced for loop
        for (String s : list) {
            System.out.println(s);
        }
        //list.get(5)  IndexOutOfBoundException索引越界异常(集合)
        // ArrayIndexOutOfBoundException:数组索引越界异常 StringIndexOutOfBoundsException字符创索引越界异常
    }
}
