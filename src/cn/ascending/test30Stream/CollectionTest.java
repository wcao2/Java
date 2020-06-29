package cn.ascending.test30Stream;

import cn.ascending.utils.Person;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> one=new ArrayList<>();
        one.add("张无忌");
        one.add("周芷若");
        one.add("赵薇");
        one.add("张强");
        one.add("张三丰");
        one.add("克林顿");
        ArrayList<String> two=new ArrayList<>();
        two.add("张国焘");
        two.add("张宝成");
        two.add("张飞");
        two.add("李世民");
        two.add("李光地");
        two.add("李鹏");

        //1:第一个队伍只要三个字的成员 存储到一个新的集合中one1
        ArrayList<String> one1=new ArrayList<>();
        for(String name:one){
            if(name.length()==3){
                one1.add(name);
            }
        }
        //2:第一个队伍[筛选之后]只要前三个人 存储到一个新集合中
        ArrayList<String> one2=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            one2.add(one1.get(i));
        }

        //3:第二个队伍只要姓张的成员姓名 存储到一个新集合中
        ArrayList<String> two1=new ArrayList<>();
        for(String name:two){
            if(name.startsWith("张")){
                two1.add(name);
            }
        }
        // 4:第二个队伍[筛选之后]不要前两个人 存到一个新集合中
        ArrayList<String> two2=new ArrayList<>();
        for (int i = 2; i <two1.size() ; i++) {
            two2.add(two1.get(i));
        }
        //5:将两个队伍合并成为一个队伍 存储到新集合中
        ArrayList<String> all=new ArrayList<>();
        all.addAll(one2);
        all.addAll(two2);

        //6:根据姓名创建person对象 存储到一个新集合中
        ArrayList<Person> list=new ArrayList<>();
        for(String name:all){
            list.add(new Person(name));
        }

        //7:打印整个队伍的person对象信息
        for(Person person:list){
            System.out.println(person);
        }
    }

}
