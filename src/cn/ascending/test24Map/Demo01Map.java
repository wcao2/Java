package cn.ascending.test24Map;

import java.util.HashMap;
import java.util.Map;

/*
*  java.util.Map<K,V>集合
*  1: Map集合是一个双列集合 一个元素包含两个值key,value
*  2: Map集合中的元素 key,value数据类型可以一样或不同
*  3: Map中的key不能重复
*  4: key value一一对应
*
*  java.util.HashMap<k,v>集合 implements Map<k,v>接口 *  底层是Hash表 查询速度快
*  java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合 是一个有序集合 存储元素和取出元素顺序一致
*
*  添加对象 先计算对象的hashcode 如果相等(same bucket) 再用equals方法 如果相等 替代之前的 如果hashcode不存在 直接新建bucket
* */
public class Demo01Map {
    //MAP接口中常用方法
    public static void main(String[] args) {
        show01();
    }

    //public V put(K key, V value):把键和值添加到map集合中
    private static void show01() {
        //创建Map集合对象 多态
        Map<String ,String> map=new HashMap<>();
        //1:put method
        map.put("A","a");
        map.put("B","b");
        map.put("C","b");
        map.put("A","d");
        System.out.println(map);// {A=d, B=b, C=b}
        //2:remove method 把指定键值对在Map集合中删除 返回被删除元素的值. k不存在 返回null
        Map<String,Integer> map1=new HashMap<>();
        map1.put("cw",183);
        Integer v1=map1.remove("cw");//多使用包装类 少用基本类型 因为可能返回null, 会有nullpointerexception
        System.out.println("v1: "+v1);
        System.out.println(map1);// { }
        //3:通过key获取value 没有返回null
        String value=map.get("A");
        System.out.println(value);
        //4:是否包含key
        boolean bool = map.containsKey("A");
        System.out.println("bool: "+bool);
    }
}
