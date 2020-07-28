package cn.ascending.test15final;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

// 1:final keyword used to desc the class: public final class 类名称{}
// 2:final关键字用来修饰方法 : 修饰符 final 返回值类型 方法名称(参数列表){方法体}
     //对于类和方法来说 abstract和final不能一起出现
// 3:用来修饰一个局部变量 这个变量就不能再修改 (只要保证唯一一次赋值)
    //对于基本类型来说 不可变说的是变量中的数值 对引用类型来说 不可变指的是变量中的地址值不可以改变
// 4:修饰成员变量
// 当前类不能有任何子类 可以有父亲类
public class Demo195 {

    public void method(){
        System.out.println("方法执行");
    }

    public static void main(String[] args) {
        final int a;//local variable
        a=20;

        Student s1=new Student("王力宏");
        System.out.println(s1.getName());//王力宏
        s1=new Student("朱时茂");
        System.out.println(s1.getName());//朱时茂
        System.out.println("============================");
        final Student s2=new Student("小沈阳");
        System.out.println(s2.getName());
        //s2=new Student("程野");
        //但是可以重新赋值
        s2.setName("小沈龙");
        System.out.println(s2.getName());
    }

}

class Student{
    String name;
    //对于final修饰的instance variable 必须手动赋值(直接赋值 或 通过构造方法赋值) 二选一
    private final String school="GMU";

    public Student(String name) {
        this.name = name;
    }

    //没有setSchool()
    public String getSchool() {
        return school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}