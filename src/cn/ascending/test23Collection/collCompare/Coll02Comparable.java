package cn.ascending.test23Collection.collCompare;

import cn.ascending.utils.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//在用Collections类的sort方法排序时若不指定Comparator，那就以自然顺序排序。所谓自然顺序就是实现Comparable接口设定的排序方式。
//一个已经实现comparable的类的对象或数据，可以通过Collections.sort(list) 或者Arrays.sort(arr)实现排序。
// 通过Collections.sort(list,Collections.reverseOrder());对list进行倒序排列
public class Coll02Comparable {
    public static void main(String[] args) {
        //自定义规则进行排序
        ArrayList<Person> list03=new ArrayList<>();
        //Person implements Comparable接口 并且重写CompareTo方法
        list03.add(new Person("A",12));//匿名对象
        list03.add(new Person("B",13));
        list03.add(new Person("C",10));
        System.out.println("before sort list03 is "+list03);
        System.out.println("after sort list03 is " );
        Collections.sort(list03);//升序
        System.out.println(list03);//升序
        System.out.println("---------------");
        //自己定义比较器 降序 实现Comparator接口
        Collections.sort(list03, new Comparator<Person>() {
            @Override
            public int compare(Person t1, Person t2) {
                return t2.getAge()-t1.getAge();
            }
        });

        System.out.println(list03);//降序
        //whatever Integer or String, they are all implements comparable interface then override compareTo function
    }
}
