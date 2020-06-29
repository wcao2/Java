package cn.ascending.test05Comparable;

import java.util.Arrays;

//how to use comparable interface
public class CompareTest {
    public static void test1(){
        //due to String implements Comparable interface,重写compareTo方法
        String[] arr=new String[]{"AA","CC","BB"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        test1();
    }
}
