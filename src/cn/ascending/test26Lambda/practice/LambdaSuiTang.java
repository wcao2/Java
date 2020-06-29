package cn.ascending.test26Lambda.practice;

import cn.ascending.utils.Student;

import java.util.*;
import java.util.stream.Collectors;

//lambda expression ()=>{}
// 1:其中的一种应用是对functional interface, fi is part of lambda expression, due to we could just write one line of interface implementation
// 2: combine with Stream to do some simplified operation with collection, array
public class LambdaSuiTang {
    @FunctionalInterface//严格确认 这个interface只有一个方法
    interface MyString{
        String myStringFunction(String str);
    }

    //1.1
    static class MyStringImpl implements MyString{
        //public MyStringImpl(){};
        @Override
        public String myStringFunction(String str) {
            return "Good Morning "+str+"!";
        }
    }
    public static void main(String[] args) {
        //1.2
        MyString classString=new LambdaSuiTang.MyStringImpl();
        System.out.println(classString.myStringFunction("Wei Cao"));

        //2  create anonymous inner classes.
        MyString classString2=new MyString(){//new interface必须有具体的implementation
            @Override
            //anonymous class implementation
            public String myStringFunction(String str) {
                return "Good Morning "+str+"!";
            }
        };
        System.out.println(classString2.myStringFunction("David"));

        //3 Java8 new feature anonymous function
        MyString value=(str)->{ return "Good Morning "+str+"!";};//value相当于实现类
        MyString value2=(str)->"Good Afternoon "+str+"!";

        System.out.println(value.myStringFunction("Wei Cao"));
        System.out.println(value2.myStringFunction("Trump"));

        System.out.println("======================================================");
        List<String> items=new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        for(String item:items){
            System.out.println("advanced for loop: "+item);
        }
        items.forEach((String str)->{//String can be omit, cos items has a generic type
            System.out.println("for each in Java8: "+str);
        });
        System.out.println("======================================================");
        //https://blog.csdn.net/eff666/article/details/63692840
        Comparator<Student> ageComparator=(s1,s2)->(int) (s1.getAge()-s2.getAge());
        Student[] stuArr=new Student[2];
        stuArr[0]=new Student("A",12);
        stuArr[1]=new Student("B",1);
        Arrays.sort(stuArr,ageComparator);
        System.out.println("stuArr is "+Arrays.toString(stuArr));
        System.out.println("======================================================");
        List<Student> stus=new ArrayList<>();
        stus.add(new Student("Wei Cao",12));
        stus.add(new Student("Jason Wu",28));
        stus.add(new Student("Gou Dan",28));
        //stream() 变成lambda可操作的东西 || stream对象只在memory中存在 并不是真实的java obj, 所以要用collect转化成真实的java obj
        List<Student> afterFilter = stus.stream().filter(s -> s.getName() == "Wei Cao").collect(Collectors.toList());
        System.out.println("afterFilter "+afterFilter);
        System.out.println("======================================================");
        List<String> r2 = stus.stream().map(s -> s.getName()).collect(Collectors.toList());
        System.out.println("r2 is "+r2);
        List<Integer> r3 = stus.stream().map(Student::getAge).collect(Collectors.toList());
        System.out.println("r3 is "+r3);
        System.out.println("========================111==============================");
        //得到string
        String joined=stus.stream().map(Student::toString).collect(Collectors.joining(", "));
        System.out.println("joined "+joined);
        System.out.println("======================================================");
        //same age's student put into a List
        Map<Integer,List<Student>> byAge=stus.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println("=======================get by key=========================");
        System.out.println(byAge.keySet());
        System.out.println("=======================get by value=========================");
        System.out.println(byAge.values());
        System.out.println("=======================entry set=========================");
        Set<Map.Entry<Integer, List<Student>>> entries = byAge.entrySet();
        for(Map.Entry<Integer,List<Student>> entry:entries){
            Integer key = entry.getKey();
            List<Student> value1 = entry.getValue();
            System.out.println(key+"==========>"+value1);
        }
    }
}