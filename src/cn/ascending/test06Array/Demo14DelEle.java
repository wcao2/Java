package cn.ascending.test06Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo14DelEle {
    public static void main(String[] args) {
        int[] oldArray=new int[]{1,2,3,4,5,6};
        int num=2;// 删除索引为2的元素，3
        int[] newArray=new int[oldArray.length-1];
        for (int i = 0; i < newArray.length; i++) {
            if(num<0 || num>=oldArray.length){
                throw new RuntimeException("element out of bound");
            }
            if(i<num){
                newArray[i]=oldArray[i];
            }else {
                newArray[i]=oldArray[i+1];
            }
        }
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));

        /*ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0,"第 0 个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除元素前："+objArray);
        objArray.remove(1);
        objArray.remove("第 0 个元素");
        System.out.println("数组删除元素后："+objArray);*/
    }
}
