package cn.ascending.test30Stream;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵薇");
        list.add("张强");
        list.add("张三丰");
        //张开头
        List<String> zhangList=new ArrayList<>();
        for(String name:list){
            if(name.startsWith("张")){
                zhangList.add(name);
            }
        }
        //三个字
        List<String> shortList=new ArrayList<>();
        for(String name:zhangList){
            if(name.length()==3){
                shortList.add(name);
            }
        }
        //遍历
        for(String name:shortList){
            System.out.println(name);
        }

        System.out.println("==============");
        List<String> listA=new ArrayList<>();
        //Stream流是JDK1.8后出现的 关注是做什么 而不是怎么做
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));

    }
}
