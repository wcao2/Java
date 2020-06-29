package cn.ascending.test01.demo02;
//https://www.youtube.com/watch?v=wpHth--nGv8
import cn.ascending.utils.Student;

public class Demo03Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student();
        s1.setName("a");
        s1.setAge(12);
        //variable s1 and s2 point to the same reference object
        Student s2=s1;

        Student s3 = s1.clone();

        System.out.println(s1+" "+s1.hashCode());
        System.out.println(s2+" "+s2.hashCode());
        System.out.println(s3+" "+s3.hashCode());
        System.out.println(s1+" "+s1.toString());
        System.out.println(s2+" "+s2.toString());
        System.out.println(s3+" "+s3);


/*

        Student s2=new Student();
        s2.setName("b");
        s2.setAge(13);*/
    }
}
