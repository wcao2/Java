package cn.ascending.test30Stream;

import cn.ascending.utils.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamsuitang {
    public static void main(String[] args) {
        //大于5的
        List<Integer> l1=new ArrayList<>();
        l1.add(3);
        l1.add(4);
        List<Integer> l2=new ArrayList<>();
        l2.add(5);
        l2.add(6);
        List<List<Integer>> twoD=new ArrayList<>();
        twoD.add(l1);
        twoD.add(l2);

        //1:
        List<Integer> result=new ArrayList<>();
        twoD.forEach(//forEach()不用stream()
                l->{
                    List<Integer> temp = l.stream().filter(e -> e > 5).collect(Collectors.toList());
                    result.addAll(temp);
                }
        );
        for(Integer r:result){
            System.out.println(r);
        }
        //2(升级版): flatmap: 把几个小的list转换到一个大的list   [[3,4],[5,6]]==>[3,4,5,6]  convert the two dimension matrix to a list
        List<Integer> result1= twoD.stream().flatMap(l->l.stream()).filter(e->e>5).collect(Collectors.toList());
        System.out.println("result1------------------- "+result1);

        //每个对象＋1
        List<Integer> result2=twoD.stream().flatMap(l->l.stream()).map(e->e+1).collect(Collectors.toList());
        System.out.println(result2);

        //====================================
        //通过lambda expression 把 Map<String, Employee> 变成 List<Employee>
        Map<String, Student> mapStudent=new HashMap<>();
        List<String> result3=mapStudent.keySet().stream().collect(Collectors.toList());
        List<Student> result4=mapStudent.values().stream().collect(Collectors.toList());
        System.out.println(result3);// []
        //通过lambda expression 把 List<Employee> 变成 Map<String, Employee>
        List<Student> list=new ArrayList<>();
        list.add(new Student("A",12));
        list.add(new Student("B",13));
        list.add(new Student("C",14));
        Map<String, Student> mapStudent1=list.stream().collect(Collectors.toMap(Student::getName, Function.identity()));
        System.out.println("mapS1: "+mapStudent1);
        Map<String, Student> mapStudent2=list.stream().collect(Collectors.toMap(Student::getName, l->l));
        System.out.println("mapS2: "+mapStudent2);
    }
}
















