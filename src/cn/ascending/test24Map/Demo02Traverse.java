package cn.ascending.test24Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
*  Map集合遍历的第一种方式 通过键找值
*  Map集合中的方法 Set<k> ketSet() 返回映射中包含键的set视图
*  step3: 通过map集合中的get(key)找到value
* */
public class Demo02Traverse {
    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<>();
        map.put("A","Jonny");
        map.put("B","Danny");
        map.put("C","Peter");
        //map.put("","Peter");
        //1: 使用map集合中的ketset()方法， 把map集合中所有的key取出 存储到set集合中
        Set<String> set=map.keySet();
        //2: 遍历set集合 获取Map集合中的每一个key
        Iterator<String> it = set.iterator();//Collection 接口中有个方法 iterator() ， 这个方法返回的是迭代器的实现类对象
        while (it.hasNext()){
            String key=it.next();
            //3:通过map集合中的get(key)找到value
            String value=map.get(key);
            System.out.println(key+" ==> "+value);
        }
        System.out.println("========================");
        for (String key : set) {
            String value=map.get(key);
            System.out.println(key+"------>"+value);
        }

        System.out.println("".toString()); //allocate a memory
        //System.out.println(null.toString); error
    }
}
