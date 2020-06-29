package cn.ascending.test24Map;

import java.util.Hashtable;

/*
*  java.util.Hashtable集合 implements Map<K,V>接口
* */
public class Demo06HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> table=new Hashtable<>();
        //table.put("",null);//nullpointerexception due to null value
        table.put(null,"");//nullpointerexception due to null key
        System.out.println(table);
        //but HashMap allows to have null key and null value
    }


}
