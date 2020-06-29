package cn.ascending.test09ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
 *  用一个大集合存入20个数字 然后筛选其中的偶数元素 放到小集合中
 *  1: 创建一个集合 存储int数字 <Integer>
 *  2: 随机数字用 Random.nextInt() 没有范围 所以没有参数
 *  3: 寻20次 把随机数字放入大集合
 *  4: 自定义一个方法 用来进行筛选
 *  返回值类型: ArrayList小集合
 *  方法名称: getSmallList
 *  参数列表 ArrayList大集合 (装着20个随机数字)
 *  5:判断如果是偶数 num%2==0 放到小集合中
 */
public class Demo07Pra {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;//[0,99]=>[1,100]
            bigList.add(num);
        }
        ArrayList<Integer> smallList=getSmallList(bigList);
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    //接收大集合参数 返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num=bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
