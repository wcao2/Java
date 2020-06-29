package cn.ascending.test07oop;

/*
*   constructor is used to create object, when we use new key word to create object, actually we are calling constructor method
*   格式： public 类名称(参数类型,参数名称){}
*   notice: there is no any return type(void)
*   构造方法也是可以重载(overload)的,方法名称一样，参数列表不同
* */
public class Demo09Constructor {
    public String name;
    public int age;

    public Demo09Constructor(){
        System.out.println("无参数构造方法执行啦");
    }
    public Demo09Constructor(String name,int age){
        System.out.println("有参数构造方法执行啦");
        this.name=name;
        this.age=age;
    }
}

class main{
    public static void main(String[] args) {
        //Demo09Constructor dc=new Demo09Constructor();
        Demo09Constructor dc=new Demo09Constructor("Wei",20);
        System.out.println(dc.name+" "+dc.age);
    }
}
