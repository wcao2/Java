package cn.ascending.test23Collection.collCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
*  public static<T> void sort(List<T> list, Comparator<? super T>) 集合中的元素按照指定规则排序
*
*  Comparator和Comparable区别: comparable相当于内部比较器。comparator相当于外部比较器。
*  1: Comparable:this和别人参数比较 需要实现comparable接口 重写比较规则 compareTo方法
*  2: comparator 相相当于找一个第三方裁判 来比较两个   Define the comparator定义比较器
* */

/*
    在用Collections类的sort方法排序时若不指定Comparator，那就以自然顺序排序。所谓自然顺序就是实现Comparable接口设定的排序方式。
    若一个类实现了comparable接口，则意味着该类支持排序。如String、Integer自己就实现了Comparable接口，可完成比较大小操作。
    一个已经实现comparable的类的对象或数据，可以通过Collections.sort(list) 或者Arrays.sort(arr)实现排序。
    通过Collections.sort(list,Collections.reverseOrder());对list进行倒序排列。
* */
public class Coll03Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {//匿名内部类
            @Override
            //重写比较规则
            public int compare(Integer t1, Integer t2) {
                return t2-t1;//降序
            }
        });
        System.out.println(list);
    }
}
