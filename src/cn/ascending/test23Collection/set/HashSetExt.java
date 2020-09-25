package cn.ascending.test23Collection.set;

import java.util.HashSet;
//write an Object with hashcode() and equals(), then add them into HashSet
public class HashSetExt extends Object{
    int val;
    public HashSetExt(int val) {
        this.val = val;
    }

    //最好重写equals 因为即使new两个HashSetExt, 构造方法有着相同的parameter， 若不重写，默认会认为是两个不一样对象 比较的是地址值(我们想认为是一样的)
    // default   public boolean equals(Object var1) { return this == var1;}
    @Override
    public boolean equals(Object t){
        return val == ((HashSetExt)t).val;
    }

    @Override
    public int hashCode(){
        return val;
    }

    @Override
    public String toString() {
        return "Test{" +
                "val=" + val +
                '}';
    }

    public static void main(String[] args) {
        HashSetExt t1 = new HashSetExt(3);
        HashSetExt t2 = new HashSetExt(3);
        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);

        HashSet<HashSetExt> hs=new HashSet<>();
        System.out.println("t1's hashcode ==> "+t1.hashCode());
        System.out.println("t2's hashcode ==> "+t2.hashCode());
        System.out.println(t1.equals(t2));
        hs.add(t1);
        hs.add(t2);
        System.out.println(hs);
    }
}
