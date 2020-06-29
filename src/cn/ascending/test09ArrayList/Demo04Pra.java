package cn.ascending.test09ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//生成6个1~33之间的随机整数,添加到集合,并遍历集合
public class Demo04Pra {
    /*
     * 1:需要存储6个数字 创建一个集合 <Integer>
     * 2:产生随机数 需要用到 Random
     * 3:循环6次 产生六个随机数字
     * 4: 循环内调用 r.nextInt(int n) 参数是33， [0~32]，整体+1 才是 [1~33]
     * 5: 把数字添加到集合中：add
     * 6: 遍历集合: for size get
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
        }
        //遍历集合
      /*  for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        /*list.forEach(i->{
            System.out.println(i);
        });*/

        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
