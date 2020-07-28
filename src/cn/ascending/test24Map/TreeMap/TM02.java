package cn.ascending.test24Map.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TM02 {
    public static void main(String[] args) {
        //引用Comparator,降序排列Key 默认升序
        TreeMap<Integer,Integer> tree = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2-t1;
            }//key的降序
        });
        tree.put(1,2);
        tree.put(3,3);
        tree.put(2,2);
        System.out.println(tree);
    }
}
