package cn.ascending.test23Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
*  java.utils.collection接口
*  所有集合最顶层接口 定义所有集合共性方法
* */
public class demo01CollFuns {
    public static void main(String[] args) {
        //创建集合对象 使用多态(接口指向对应的实现类)
        Collection<String> coll=new ArrayList<>();
        System.out.println("the coll is "+coll);//打印不是地址 重写toString方法  []

        //1: public boolean add(E e): 把指定的对象添加到集合中 一般都返回true 可以不用接收
        coll.add("Peter");
        coll.add("Sam");
        coll.add("Andy");
        coll.add("Jason");
        coll.add("Wayne");
        coll.add("Wayne");
        System.out.println("After add elements: "+coll);

        //2: public boolean remove(E e): 把指定的对象 在当前集合中删除 若集合中不存在这个元素 删除失败 返回false
        boolean b1=coll.remove("Andy");
        System.out.println("b1: "+b1);
        System.out.println("After delete one element: "+coll);
        boolean b2=coll.remove("nothing");
        System.out.println("b2: "+b2);

        //3: public boolean contains(E e):判断集合中是否包含指定对象 包含返回true 不包含返回false
        boolean b3=coll.contains("Jason");
        System.out.println("b3: "+b3);

        //4: public boolean isEmpty(): 判断当前集合是否为空
        boolean b4 = coll.isEmpty();
        System.out.println("b4 "+b4);//如果不为空 返回false

        //5: public ins size(): 返回集合中元素个数
        int size=coll.size();
        System.out.println("size: "+size);

        //6: public Object[] toArray(): 把集合中的元素 存储的数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("the elements in array "+arr[i]);
        }

        //7: public void clear(): 清空集合中所有元素 不删除 集合还在
        coll.clear();
        System.out.println("After clear the collection: "+coll);
    }
}
