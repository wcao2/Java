package cn.ascending.test26Lambda.practice;

import cn.ascending.utils.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
*  对数组Person对象的年龄进行排序
*  1,2,3同时存在一个
* */
public class LambdaSort {
    public static void main(String[] args) {

        //Person[] arr1=new Person[3]; dynamic initialization
        //static initialization
        Person[] arr={
                new Person("A",18),
                new Person("B",19),
                new Person("C",2)
        };
        //1: Person already implemented comparable interface's and override compareTo method in Person Object
        Arrays.sort(arr);
        System.out.println("=================using sort method===============");
        System.out.println(Arrays.toString(arr));//age ascending

        System.out.println("=============introduce Comparator interface by using Anonymous class===================");
        //2
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                //descending order age
                return p2.getAge()-p1.getAge();
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("==============Traverse an array based on an descending age==================");
        //traverse array
        for(Person p:arr){
            System.out.println(p);
        }

        System.out.println("==============Anonymous inner class==================");
        //3:使用lambda expression， 简化匿名内部类
        Arrays.sort(arr,(Person p1,Person p2)->{
            return p2.getAge()-p1.getAge();//same like above still descending order
        });
        System.out.println(Arrays.toString(arr));
        //traverse array
        System.out.println("===============Traverse array=========================");
        for(Person p:arr){
            System.out.println(p);
        }
        System.out.println(Arrays.toString(arr));
    }
}






















