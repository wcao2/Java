package cn.ascending.test23Collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
*  java.util.LinkedHashSet集合 extends HashSet集合
*  1:底层是一个哈希表＋链表(记录元素的存储顺序)
* */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("com");
        System.out.println(set);//disorder and no repeat

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("www");
        lhs.add("abc");
        lhs.add("abc");
        lhs.add("com");
        System.out.println(lhs);//orderly and no repeat
    }
}
