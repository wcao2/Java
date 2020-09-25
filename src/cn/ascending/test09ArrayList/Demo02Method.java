package cn.ascending.test09ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

//common methods
public class Demo02Method {
    /*
    *  1: public boolean add(E e) 向集合中添加元素， 参数类型和泛型一致 返回值boolean代表添加是否成功
    *  2： public E get(int index) 从集合中获取元素 参数是索引编号，返回值是对应位置的元素
    *  3: public E remove(int index) 从集合中删除元素，参数是索引编号，返回值就是被删除的元素
    *  4: public int size() 获取集合尺寸长度，返回值是集合中包含的元素个数
    */
    public static void main(String[] args) {
        System.out.println(5/2);
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//[]

        boolean success=list.add("Jason");
        System.out.println(list);//[Jason]
        System.out.println("添加动作是否成功: "+success);

        list.add("Jenny");
        list.add("Nancy");
        list.add("Trump");
        //获取集合元素
        String name=list.get(2);
        System.out.println("the third element is "+name);
        //从集合中删除元素
        String remove = list.remove(3);
        System.out.println("the person deleted is "+remove);
        System.out.println(list);
        //获取集合长度尺寸，也就是元素的个数
        int size=list.size();
        System.out.println("the length of the 集合 is "+size);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("================");
        for(String i:list){
            System.out.println(i);
        }
        System.out.println("================");
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("================");
        list.forEach(ele-> System.out.println(ele));

    }
}
