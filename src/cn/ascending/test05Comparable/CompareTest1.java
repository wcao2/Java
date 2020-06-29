package cn.ascending.test05Comparable;

import java.util.Arrays;

public class CompareTest1 {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Goods[] arr=new Goods[3];
        arr[0]=new Goods("lenovo",34);
        arr[1]=new Goods("dell",54);
        arr[2]=new Goods("huawei",24);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
