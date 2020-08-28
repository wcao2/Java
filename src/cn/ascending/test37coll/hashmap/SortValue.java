package cn.ascending.test37coll.hashmap;

//Java HashMap按照value值排序的方法

import java.util.*;

public class SortValue {
    public static void main(String[] args) {
        Map< Integer, String> map=new HashMap<Integer, String>();

        map.put(101, "Hemendra");
        map.put(99, "Andrew");
        map.put(103, "Anish");
        map.put(18, "Mohan");
        map.put(11, "Christine");
        map.put(109, "Rebeca");
        map.put(111, "David");
        map.put(19, "Rahim");
        map.put(10, "Krishna");
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        Map<String,Integer> map1=new HashMap<>();
//        for(Map.Entry<Integer,String> entry:entries){
//            Integer key=entry.getKey();
//            String value=entry.getValue();
//            map1.put(value,key);
//        }
//        map1.
        List<Map.Entry<Integer, String>> entries = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
        //before sort
        for(int i=0;i<entries.size();i++){
            String value=entries.get(i).toString();
            System.out.println(value);
        }

        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> t1, Map.Entry<Integer, String> t2) {
                return t1.getValue().compareTo(t2.getValue());
            }
        });

        //after sort(based on value)
        for(int i=0;i<entries.size();i++){
            String value=entries.get(i).toString();
            System.out.println(value);
        }
    }
}

//class TMComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee e1, Employee e2) {
//        //salary ascending
//        return (int)(e1.getSalary() - e2.getSalary());//升序
//        //or
////        if(e1.getSalary()>e2.getSalary()){
////            return 1;
////        }else if(e1.getSalary()<e2.getSalary()){
////            return -1;
////        }else {
////            return 0;
////        }
//    }
//}

