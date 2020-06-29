package cn.ascending.test08oopext;

/*
*  一个类通常有四个部分组成
* 1:所有成员变量都用private修饰
* 2:为每一个成员变量编写getter and setter方法
* 3:一个无参数构造方法
* 4:一个全参数构造方法
*  Standard class is also called Java Bean
* */
public class Demo01Bean {
    private String name;
    private int age;
    //无参数构造方法
    public Demo01Bean() {
    }
    //全参数构造方法
    public Demo01Bean(String name, int age) {
        this.name = name;
        this.age = age;
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

class main{
    public static void main(String[] args) {
        Demo01Bean d1=new Demo01Bean();
        d1.setName("WeiCao");
        d1.setAge(22);
        System.out.println("name is "+d1.getName()+" age is "+d1.getAge());
        System.out.println("=======================");
        Demo01Bean d2=new Demo01Bean("David",12);
        System.out.println("name is "+d2.getName()+" age is "+d2.getAge());
    }
}