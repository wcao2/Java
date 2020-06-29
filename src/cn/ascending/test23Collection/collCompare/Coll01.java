package cn.ascending.test23Collection.collCompare;


import java.util.ArrayList;
import java.util.Collections;

/*
*  Collections是集合工具类(Collection tools) 用来对集合进行操作
*  1: public static <T> boolean addAll(Collection<T>, T...elements):往集合中添加一些元素
*  2: public static void shuffle(List<?> list) 打乱集合顺序
* */
public class Coll01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        //往集合中添加多个元素
        Collections.addAll(list,"a","d","c","d");
        System.out.println("after adding the element into a list "+list);
        //打乱集合中元素顺序
        Collections.shuffle(list);
        System.out.println("after shuffling the elements "+list);//every time diff

        System.out.println("============================");
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(2);
        list01.add(1);
        list01.add(3);
        //public static <T> void sort(list<T> list):将集合中的元素按照默认规则排序 只能是list不能set
        Collections.sort(list01);
        System.out.println(list01);
    }
}
