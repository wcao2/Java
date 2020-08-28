package cn.ascending.test37coll.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Traverse {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
        Traverse.f1(map);
    }

    public static void f1(Map<String,String> map){
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }
    }

    public void f2(Map<String,String> map){
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"==>"+entry.getValue());
        }
    }

    public void f3(Map<String,String> map){
        for(String key:map.keySet()){
            System.out.println(key+"===>"+map.get(key));
        }
    }

    public void f4(Map<String,String> map){
        for(String value:map.values()){
            System.out.println(value);
        }
    }
}
