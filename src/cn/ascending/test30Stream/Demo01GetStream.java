package cn.ascending.test30Stream;

import java.util.*;
import java.util.stream.Stream;

public class Demo01GetStream {
    public static void main(String[] args) {
        //list集合转换为stream流
        List<String> list=new ArrayList<>();
        Stream<String> stream1=list.stream();

        //Set
        Set<String> set=new HashSet<>();
        Stream<String> stream2 = set.stream();

        //Map
        Map<String,String> map=new HashMap<>();
        //get key and save it to set collection
        Set<String> keyset=map.keySet();
        Stream<String> stream3 = keyset.stream();//间接把map集合转换为stream流
        //get value and save it to collection
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //或者通过获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
       /* Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        if(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"  --> "+next.getValue());
        }*/
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //================================================================================================

        //Stream类的静态方法of
        //数组转换为stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr={1,2,3,4,5};
        Stream<Integer> stream7 = Stream.of(arr);
        String[] arr2={"a","b","c"};
        Stream<String> stream8 = Stream.of(arr2);


    }
}
