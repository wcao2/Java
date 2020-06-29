package cn.ascending.test30Stream;

import cn.ascending.utils.Person;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionTestAdvanced {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        one.add("张无忌");
        one.add("周芷若");
        one.add("赵薇");
        one.add("张强");
        one.add("张三丰");
        one.add("克林顿");
        Stream<String> oneStream=one.stream().filter(name->name.length()==3).limit(3);//只要前三个

        ArrayList<String> two=new ArrayList<>();
        two.add("张国焘");
        two.add("张宝成");
        two.add("张飞");
        two.add("李世民");
        two.add("李光地");
        two.add("李鹏");
        Stream<String> twoStream=two.stream().filter(name->name.startsWith("张")).skip(2);//跳过前两个

        //map:数据类型转换
        Stream.concat(oneStream,twoStream).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
