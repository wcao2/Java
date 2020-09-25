package cn.ascending.test24Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
*  当Map集合一创建 那么就会在map集合中创建一个Entry对象 用来记录键与值之间的映射关系(Mapping relations)(键值对对象)
*  把Map集合中的多个Entry对象取出来(entrySet()) 存储到一个set集合中
*  遍历Set集合 获取set集合中的每一个Entry对象(getKey() getValue())
* */
public class Demo03Traverse {
    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<>();
        map.put("A","Jonny");
        map.put("B","Danny");
        map.put("C","Peter");
        map.put(null,null);

        Set<Map.Entry<String, String>> set = map.entrySet();
        for(Map.Entry<String, String> entry:set){
            System.out.println(entry.getKey()+"<--->"+entry.getValue());
        }
        System.out.println("-------------------------------------");
        //遍历
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"=====>"+value);
        }
        System.out.println("==============");
        for(Map.Entry<String, String> entry:set){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"=====>"+value);
        }
        System.out.println("==============");
        //牛逼 一行
        map.forEach((k,v)-> System.out.println(" key is: "+k+" ,value is: "+v));
    }
}
