package cn.ascending.test09ArrayList;

import cn.ascending.utils.Student;

import java.util.ArrayList;

/*
 * 1:定义四个学生对象 添加到集合 并遍历
 * 2:创建一个集合 用来存储学生对象 泛型<Student>
 * 3:根据类 创建四个学生对象
 * 4:将四个学生对象添加到集合中
 * 5:遍历集合
*/
public class Demo05Pra {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student one=new Student("Wei",20);
        Student two=new Student("习近平",60);
        Student three=new Student("Jenny",30);
        Student four=new Student("David",10);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        /*for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("name: "+stu.getName()+" age: "+stu.getAge());
        }*/
        list.forEach(l-> System.out.println(l.getName()+" "+l.getAge()));
    }

}

