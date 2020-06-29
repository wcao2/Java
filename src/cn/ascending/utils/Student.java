package cn.ascending.utils;

//1:在需要调用clone方法的对象上添加实现cloneable接口
public class Student implements Cloneable{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //2:override clone method,调用父类clone方法,并将返回值类型(Object)强转成本类型,将当前克隆方法的修饰回复改成public  ==> test01->demo02
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
