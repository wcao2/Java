package cn.ascending.test37coll.hashmap;

import java.util.*;

public class SortKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("d", 3);
        map.put("c", 1);
        Set keySet=map.keySet();

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> t1, Map.Entry<String, Integer> t2) {
                return t2.getKey().toString().compareTo(t1.getKey().toString());
            }
        });

        //after sort  c=1 d=3 default d=3 c=1
        for (int i = 0; i < entries.size(); i++) {
            System.out.println(entries.get(i).toString());
        }
    }
}
