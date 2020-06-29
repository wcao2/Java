package cn.ascending.test18equals;

import java.util.Objects;

public class Demo02ObjectsEquals {
    public static void main(String[] args) {
        String s1=null;
        String s2="abc";
        //boolean b=s1.equals(s2);//nullPointerException

        /*Objects equals方法 对两个对象进行比较 防止空指针异常
        public static boolean equals(Object a, Object b){
            return(a==b)||(a!=null&&a.equals(b)); 先比较两个对象的地址值 a==b,若不相等，进行后续判断; 不是空 才会调用.equals方法;
        }*/
        boolean b1= Objects.equals(s1,s2);
        System.out.println(b1);
    }
}
