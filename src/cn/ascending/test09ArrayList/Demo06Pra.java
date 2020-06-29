package cn.ascending.test09ArrayList;

import java.util.ArrayList;

/*
 * 打印集合 ArrayList作为参数， 使用{} 使用@分隔每个元素
*/
public class Demo06Pra {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("========="+list);
        printArrayList(list);
        System.out.println("!!!!!!!!"+list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(i==list.size()-1){
                System.out.print(name+"}");
            }else{
                System.out.print(name+"@");
            }

        }
        System.out.println("");
    }
}
