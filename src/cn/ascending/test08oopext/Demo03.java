package cn.ascending.test08oopext;

import java.util.Random;
import java.util.Scanner;

/*  Anonymous
*   创建对象标准格式: 类名称 对象名=new 类名称();
*   只有右边的对象，没有左边的名字和赋值运算符 new 类名称();
* */
public class Demo03 {
    public static void main(String[] args) {
        //匿名对象只能使用唯一的一次,下次再用不得不再创建对象,(如果一个对象只想使用唯一的一次，可以用匿名对象)
        //1:
//        new Person().name="Wei Cao";
//        new Person().m1();
        //2:
//       int num=new Scanner(System.in).nextInt();
//        System.out.println("the input is "+num);
        //3:
        //new 一个匿名对象，把它放入方法参数小括号中
        methodParam(new Scanner(System.in));

        //4:匿名对象作为方法返回值
        Scanner scanner = methodReturn();
        System.out.println("please input sth again");
        int i = scanner.nextInt();
        System.out.println("the input is "+i);
    }

    //3
    public static void methodParam(Scanner sc){
        System.out.println("please input sth");
        int i = sc.nextInt();
        System.out.println("the input is "+i);
    }

    //4
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}

class Person{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void m1(){
        System.out.println("the name is "+name);
    }
}
