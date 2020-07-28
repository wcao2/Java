package cn.ascending.test24Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
*  java.util.linkedHashMap<K,V> extends HashMap<>
* */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","A");
        System.out.println(map);//no repeated(key), disorderly  {a=A, b=b, c=c}

        LinkedHashMap<String,String> linked=new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","A");
        System.out.println(linked);//no repeated(key), orderly   {a=A, c=c, b=b}
    }
}
