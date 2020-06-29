package cn.ascending.test24Map;

import cn.ascending.utils.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*  HashMap存储自定义键值类型
*  Map集合保证键是唯一的：必须重写hashcode方法和equals方法 用来保证key唯一
* */
public class Demo04EntrySet {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    private static void show02() {
        //key is person type
        HashMap<Person,String> map=new HashMap<Person,String>();
        map.put(new Person("Jonny",18),"BJ");
        map.put(new Person("Peter",28),"DC");
        map.put(new Person("ZhaoSi",38),"LA");
        map.put(new Person("ZhaoSi",38),"XA");
        //使用entrySet和增强for遍历map集合
        //当Map集合一创建 那么就会在map集合中创建一个Entry对象 用来记录键与值之间的映射关系(Mapping relations)(键值对对象)
        //把Map集合中的多个Entry对象取出来(entrySet()) 存储到一个set集合中
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-------->"+value);
        }
        System.out.println("=================================");
        Set<Person> set1=map.keySet();
        for(Person key:set1){
            String value=map.get(key);
            System.out.println(key+"=======>"+value);
        }
    }

    private void demo03(){
        Map<String,String> m=new HashMap<>();
        for(Map.Entry es: m.entrySet()){
            Object a=es.getValue();
            Object b=es.getValue();
        }
    }

    private static void show01() {
        //创建hashmap
        HashMap<String,Person> map=new HashMap<String, Person>();
        map.put("BJ",new Person("Jonny",18));
        map.put("DC",new Person("Peter",28));
        map.put("LA",new Person("ZhaoSi",38));
        map.put("LA",new Person("ZhaoLiu",48));//key重复 新的value值替换之前的value值
        //使用keyset和for遍历map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"====>"+value);
        }
    }
}
