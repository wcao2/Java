package cn.ascending.test24Map;

import java.util.HashMap;
//write an Object with hashcode() and equals(), then add them into HashMap
public class HashMapExt {

    private String key;

    public HashMapExt(String key) {
        this.key = key;
    }

    //因为key是HashMapExt对象 所以需要写规则判断是否相同
    @Override
    public boolean equals(Object t){
        return key == ((HashMapExt)t).key ;
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(key);
    }

    @Override
    public String toString() {
        return key;
    }

    public static void main(String[] args) {
        HashMap<HashMapExt,Integer> hs=new HashMap<>();
        HashMapExt hme1=new HashMapExt("5");//constructor method
        HashMapExt hme2=new HashMapExt("5");
        HashMapExt hme3=new HashMapExt("6");
        System.out.println(hme1.hashCode());
        System.out.println(hme2.hashCode());
        hs.put(hme1,1);
        hs.put(hme2,2);
        hs.put(hme3,3);
        System.out.println(hs);//{5=2, 6=3}
    }
}
