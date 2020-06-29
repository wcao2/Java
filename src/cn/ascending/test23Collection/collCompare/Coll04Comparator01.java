package cn.ascending.test23Collection.collCompare;

import cn.ascending.utils.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coll04Comparator01 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("A",42));
        list.add(new Student("B",12));
        list.add(new Student("C",12));
        System.out.println(list);
        System.out.println("============");
        Collections.sort(list, new Comparator<Student>() {//匿名内部类
            @Override
            public int compare(Student stu1, Student stu2) {
                int result= stu1.getAge()-stu2.getAge();//升序
                //if same age, use name first letter
                if(result==0){
                    result=stu1.getName().charAt(0)-stu2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);
    }
}
